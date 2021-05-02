package sygus.lang


import kotlin.test.Test
import kotlin.test.assertEquals

internal class ProgramTest {

    @Test
    fun testProgram01() {
        val body = ASTNode(
            "ite",
            ASTNode(">=", ASTNode("x"), ASTNode("y")),
            ASTNode("true"), ASTNode("false"),
        )
        assertEquals("(ite (>= x y) true false)", body.toString())

        val funcDef = FunctionDef(
            "isLarger",
            Signature(TypeName.Bool, Pair("x", TypeName.Int), Pair("y", TypeName.Int)),
            body
        )
        val expected = """
            (define-fun isLarger ((x Int) (y Int)) Bool
                (ite (>= x y) true false)
            )
            """.trimIndent()
        assertEquals(expected, funcDef.toString())
    }
}