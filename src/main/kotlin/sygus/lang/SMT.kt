package sygus.lang

import com.microsoft.z3.Context
import com.microsoft.z3.Sort
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import sygus.antlr.SygusLexer
import sygus.antlr.SygusParser

typealias SMTLIB2Str = String

class SMT(val logicName: String? = null) {

    fun evalFuncInvocation(defineFun: SMTLIB2Str, invocation: SMTLIB2Str): String {
        val ctx = Context()

        // create constraints
        val result = ctx.mkConst("result", resultSort(ctx, defineFun))
        val assert = ctx.parseSMTLIB2String(
            """
            ${result.funcDecl}
            $defineFun
            (assert (= (${invocation.trim('(', ')')}) result))
            """, null, null, null, null
        )[0]

        // solve to get the evaluated value
        val s = ctx.mkSolver(logicName)
        s.add(assert)
        s.check()
        return s.model.getConstInterp(result).toString()
    }

    private fun resultSort(ctx: Context, defineFun: SMTLIB2Str): Sort {
        val charStream = CharStreams.fromString(defineFun)
        val lexer = SygusLexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SygusParser(tokenStream)
        val start = parser.funDefCmd()
        return sortFromStr(ctx, start.sortExpr().text)
    }

    private fun sortFromStr(ctx: Context, str: SMTLIB2Str): Sort {
        return when (str) {
            "Int" -> ctx.intSort
            "Bool" -> ctx.boolSort
            else -> throw IllegalStateException("not supported sort: $str")
        }
    }

}