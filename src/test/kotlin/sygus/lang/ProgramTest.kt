package sygus.lang


import kotlin.test.Test
import kotlin.test.assertEquals

internal class ProgramTest {

    @Test
    fun testProgram01() {
        val funcDef = FunctionDef(
            "isLarger",
            Signature(BoolT, Pair("x", IntT), Pair("y", IntT)),
            ASTNode(
                "ite",
                ASTNode(">=", ASTNode("x"), ASTNode("y")),
                ASTNode("true"), ASTNode("false"),
            )
        )
        // toString
        val expected = """
            (define-fun isLarger ((x Int) (y Int)) Bool
                (ite (>= x y) true false)
            )
            """.trimIndent()
        assertEquals(expected, funcDef.toString())

        // invocation
        assertEquals("true", funcDef.apply("12", "3"))
        assertEquals("false", funcDef.apply("12", "31"))
    }
}