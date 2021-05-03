package sygus.lang

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.misc.Interval
import sygus.antlr.SygusLexer
import sygus.antlr.SygusParser
import sygus.antlr.SygusParser.*

typealias RuleName = String

sealed class TypeName {
    abstract fun isValid(value: String): Boolean

    companion object {
        fun from(string: String): TypeName {
            val charStream = CharStreams.fromString(string)
            val lexer = SygusLexer(charStream)
            val tokenStream = CommonTokenStream(lexer)
            val parser = SygusParser(tokenStream)
            val sortCtx = parser.sortExpr()

            return when (val c = sortCtx) {
                is BoolSortContext -> BoolT
                is IntSortContext -> IntT
                is BitVecSortContext -> {
                    BitVecT(c.intConst().text.toInt())
                }
                else -> throw IllegalStateException("not supported: ${c.text}")
            }
        }
    }
}

object BoolT : TypeName() {
    override fun isValid(value: String): Boolean {
        return value == "true" || value == "false"
    }

    override fun toString() = "Bool"
}

object IntT : TypeName() {
    override fun isValid(value: String): Boolean {
        return try {
            value.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    override fun toString() = "Int"
}

class BitVecT(val size: Int) : TypeName() {
    override fun isValid(value: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun toString() = "(BitVec $size)"
}

class NotSupportedInSyGuSv2Exception(message: String) : IllegalStateException(message)

class DSL(synthFunCmdStr: SMTLIB2Str) {
    val types = mutableMapOf<RuleName, TypeName>()
    val produRules = mutableMapOf<RuleName, List<Term>>()

    private val charStream = CharStreams.fromString(synthFunCmdStr)
    private fun src(c: ParserRuleContext): String {
        return charStream.getText(Interval(c.start.startIndex, c.stop.stopIndex))
    }

    init {
        val lexer = SygusLexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SygusParser(tokenStream)
        val synthFunCmd = parser.synthFunCmd()
        collectNTDefs(synthFunCmd).forEach { ntDef ->
            val name = src(ntDef.symbol())
            val type = src(ntDef.sortExpr())
            types[name] = TypeName.from(type)

            val rules: List<Term> = collectGTerms(ntDef).map { gTerm ->
                when (gTerm) {
                    is FuncTermContext -> {
                        val terms = collectGTerms(gTerm.gTermStar()).map {
                            src(it)
                        }.toTypedArray()
                        Term(src(gTerm.symbol()), *terms)
                    }
                    is SymbolTermContext -> Term(src(gTerm.symbol()))
                    is LiteralTermContext -> Term(src(gTerm.literal()))
                    is ConstTermContext -> ConstTerm(TypeName.from(src(gTerm.sortExpr())))
                    is VarTermContext -> VarTerm(TypeName.from(src(gTerm.sortExpr())))
                    is BinederTermContext -> throw NotSupportedInSyGuSv2Exception("SyGuSv2 doesn't support: ${src(gTerm)}")
                    else -> throw IllegalStateException("not supported: " + src(gTerm))
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

open class Term(val symbol: String, vararg val params: String) {
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

class ConstTerm(val typeName: TypeName) : Term("Const")
class VarTerm(val typeName: TypeName) : Term("Variable")
