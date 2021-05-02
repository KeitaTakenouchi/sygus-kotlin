package sygus.lang

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import sygus.antlr.SygusLexer
import sygus.antlr.SygusParser
import sygus.antlr.SygusParser.*

typealias RuleName = String

enum class TypeName {
    Bool, Int;

    companion object {
        fun from(string: String): TypeName {
            return when (string.toLowerCase()) {
                "bool" -> Bool
                "int" -> Int
                else -> throw IllegalStateException("not supported: $string")
            }
        }
    }
}

class DSL(synthFunCmdStr: SMTLIB2Str) {
    val types = mutableMapOf<RuleName, TypeName>()
    val produRules = mutableMapOf<RuleName, List<Term>>()

    init {
        val charStream = CharStreams.fromString(synthFunCmdStr)
        val lexer = SygusLexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SygusParser(tokenStream)
        val synthFunCmd = parser.synthFunCmd()
        collectNTDefs(synthFunCmd).forEach { ntDef ->
            val name = ntDef.symbol().text
            val type = ntDef.sortExpr().text
            types[name] = TypeName.from(type)

            val rules: List<Term> = collectGTerms(ntDef).map { gTerm ->
                when (gTerm) {
                    is FuncTermContext -> {
                        val terms = collectGTerms(gTerm.gTermStar()).map {
                            it.text
                        }.toTypedArray()
                        Term(gTerm.symbol().text, *terms)
                    }
                    is SymbolTermContext -> Term(gTerm.symbol().text)
                    is LiteralTermContext -> Term(gTerm.literal().text)
                    else -> throw IllegalStateException("not supported: " + gTerm.text)
                }
            }
            produRules[name] = rules
        }
    }

    private fun collectNTDefs(synthFunCmd: SynthFunCmdContext): List<NTDefContext> {
        val ret = mutableListOf<NTDefContext>()

        // obtain the first rule (always not null)
        val nt = synthFunCmd.nTDefPlus()
        ret.add(nt.nTDef())

        // traverse tail rules
        var tail = nt.nTDefPlusTail()
        while (tail.nTDef() != null) {
            ret.add(tail.nTDef())
            tail = tail.nTDefPlusTail()
        }

        return ret
    }

    private fun collectGTerms(nfDef: NTDefContext): List<GTermContext> {
        val ret = mutableListOf<GTermContext>()

        // obtain the first term
        val term = nfDef.gTermPlus()
        ret.add(term.gTerm())

        // traverse tail rules
        var tail = term.gTermPlusTail()
        while (tail.gTerm() != null) {
            ret.add(tail.gTerm())
            tail = tail.gTermPlusTail()
        }

        return ret
    }

    private fun collectGTerms(gTermStar: GTermStarContext): List<GTermContext> {
        val ret = mutableListOf<GTermContext>()
        var tail = gTermStar
        while (tail.gTerm() != null) {
            ret.add(tail.gTerm())
            tail = tail.gTermStar()
        }
        return ret
    }
}

class Term(val symbol: String, vararg val params: String) {
    override fun toString(): String {
        return if (params.isEmpty())
            symbol
        else
            "($symbol ${params.joinToString(separator = " ")})"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Term

        if (symbol != other.symbol) return false
        if (!params.contentEquals(other.params)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = symbol.hashCode()
        result = 31 * result + params.contentHashCode()
        return result
    }
}
