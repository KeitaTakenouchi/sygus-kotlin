package sygus.lang

import kotlin.test.Test
import kotlin.test.assertEquals

internal class DSLTest {

    @Test
    fun test01() {
        val input = """
           (synth-fun findIdx ( (y1 Int) (y2 Int) (y3 Int) (y4 Int) (k1 Int)) Int 
               (
                   (
                       Start Int (
                           0 1 y1 y2 (ite BoolExpr Start Start)
                       )
                   )
                   (
                       BoolExpr Bool (
                          (< Start Start)
                          (<= Start Start)
                          (> Start Start)
                          (>= Start Start)
                       )
                   )
               )
           )
        """
        val dsl = DSL(input)

        // types
        assertEquals(IntT, dsl.types["Start"])
        assertEquals(BoolT, dsl.types["BoolExpr"])

        // rules
        assertEquals(
            listOf(
                Term("0"),
                Term("1"),
                Term("y1"),
                Term("y2"),
                Term("ite", "BoolExpr", "Start", "Start"),
            ), dsl.produRules["Start"]
        )
        assertEquals(
            listOf(
                Term("<", "Start", "Start"),
                Term("<=", "Start", "Start"),
                Term(">", "Start", "Start"),
                Term(">=", "Start", "Start"),
            ), dsl.produRules["BoolExpr"]
        )
    }
}