package sygus.synth

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.misc.Interval
import sygus.antlr.SygusLexer
import sygus.antlr.SygusParser
import sygus.antlr.SygusParser.*
import sygus.lang.DSL
import sygus.lang.SMTLIB2Str
import sygus.lang.Signature
import sygus.lang.TypeName

class SynthProblem(problemStr: SMTLIB2Str) {
    val theory: String?

    val funcName: String
    val funcSignature: Signature
    val grammar: DSL

    val constraints = mutableListOf<String>()

    init {
        val charStream = CharStreams.fromString(problemStr)
        val lexer = SygusLexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SygusParser(tokenStream)
        val program = parser.start().prog()
        theory = program.setLogicCmd()?.symbol()?.text

        var funcName: String? = null
        var funcSignature: Signature? = null
        var grammar: DSL? = null
        var checkSynth = false
        for (cmd in collectCmds(program)) {
            when (val c = cmd.children[0] as ParserRuleContext) {
                /*********************************/
                /******* synthesis problem *******/
                /*********************************/
                is SynthFunCmdContext -> {
                    funcName = c.symbol().text
                    funcSignature = Signature(TypeName.from(c.sortExpr().text), *params(c.argList()))
                    // restore the original source code
                    val str = charStream.getText(Interval(c.start.startIndex, c.stop.stopIndex))
                    grammar = DSL(str)
                }
                /******************************************/
                /**** constraints given to SMT solver *****/
                /******************************************/
                is FunDefCmdContext,
                is VarDeclCmdContext,
                is ConstraintCmdContext -> {
                    // restore the original source code
                    val str = charStream.getText(Interval(c.start.startIndex, c.stop.stopIndex))
                    this.constraints.add(str)
                }
                /************************/
                /**** (check-synth) *****/
                /************************/
                is CheckSynthCmdContext -> {
                    checkSynth = true
                }
                else -> throw IllegalStateException("not supported command: " + cmd.children[0].text)
            }
        }
        if (!checkSynth)
            throw IllegalStateException("check-synth command not found")
        
        this.funcName = funcName!!
        this.funcSignature = funcSignature!!
        this.grammar = grammar!!
    }

    private fun collectCmds(program: ProgContext): List<CmdContext> {
        val ret = mutableListOf<CmdContext>()

        // obtain the first rule (always not null)
        val nt = program.cmdPlus()
        ret.add(nt.cmd())

        // traverse tail rules
        var tail = nt.cmdPlusTail()
        while (tail.cmd() != null) {
            ret.add(tail.cmd())
            tail = tail.cmdPlusTail()
        }

        return ret
    }

    private fun params(args: ArgListContext): Array<Pair<String, TypeName>> {
        return collectSymbolSortPairs(args.symbolSortPairStar()).map {
            Pair(it.symbol().text, TypeName.from(it.sortExpr().text))
        }.toTypedArray()
    }

    private fun collectSymbolSortPairs(input: SymbolSortPairStarContext): List<SymbolSortPairContext> {
        val ret = mutableListOf<SymbolSortPairContext>()

        // obtain the first rule (always not null)
        val p = input.symbolSortPair()
        ret.add(p)

        // traverse star rules
        var tail = input.symbolSortPairStar()
        while (tail.symbolSortPair() != null) {
            ret.add(tail.symbolSortPair())
            tail = tail.symbolSortPairStar()
        }

        return ret
    }
}