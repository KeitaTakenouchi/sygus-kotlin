package sygus.lang

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SMTTest {

    @Test
    fun testEvalFuncInvocation01() {
        val smt = SMT("LIA")
        val defineFun = """
            (define-fun max ((x Int) (y Int)) Int
                (ite (>= x y) x y)
            )
        """
        run {
            val invocation = "(max 21 44)"
            val result = smt.evalFuncInvocation(defineFun, invocation)
            assertEquals("44", result)
        }
        run {
            val invocation = "(max 45 44)"
            val result = smt.evalFuncInvocation(defineFun, invocation)
            assertEquals("45", result)
        }
        run {
            val invocation = "(max 12 12)"
            val result = smt.evalFuncInvocation(defineFun, invocation)
            assertEquals("12", result)
        }
    }

    @Test
    fun testEvalFuncInvocation02() {
        val smt = SMT()
        val defineFun = """
            (define-fun isLarger ((x Int) (y Int)) Bool
                (ite (>= x y) true false)
            )
        """
        run {
            val invocation = "(isLarger 21 44)"
            val result = smt.evalFuncInvocation(defineFun, invocation)
            assertEquals("false", result)
        }
        run {
            val invocation = "(isLarger 45 44)"
            val result = smt.evalFuncInvocation(defineFun, invocation)
            assertEquals("true", result)
        }
    }
}


