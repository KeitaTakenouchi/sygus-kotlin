package sygus.synth

import sygus.lang.Term
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SynthProblemTest {

    @Test
    fun testSynthProblem01() {
        val problem = SynthProblem(
            """
        (set-logic LIA)
        (synth-fun findIdx ( (y1 Int) (y2 Int) (y3 Int) (y4 Int) (k1 Int)) Int (
           (Start Int ( 0 1 2 3 4 y1 y2 y3 y4 k1 (ite BoolExpr Start Start)))
           (BoolExpr Bool (
              (< Start Start)
              (<= Start Start)
              (> Start Start)
              (>= Start Start)
           )
           )))
        (declare-var x1 Int)
        (declare-var x2 Int)
        (declare-var x3 Int)
        (declare-var x4 Int)
        (declare-var k Int)
        (constraint (=> (and (< x1 x2) (and (< x2 x3) (< x3 x4))) (=> (< k x1) (= (findIdx x1 x2 x3 x4 k) 0))))
        (constraint (=> (and (< x1 x2) (and (< x2 x3) (< x3 x4))) (=> (> k x4) (= (findIdx x1 x2 x3 x4 k) 4))))
        (constraint (=> (and (< x1 x2) (and (< x2 x3) (< x3 x4))) (=> (and (> k x1) (< k x2)) (= (findIdx x1 x2 x3 x4 k) 1))))
        (constraint (=> (and (< x1 x2) (and (< x2 x3) (< x3 x4))) (=> (and (> k x2) (< k x3)) (= (findIdx x1 x2 x3 x4 k) 2))))
        (constraint (=> (and (< x1 x2) (and (< x2 x3) (< x3 x4))) (=> (and (> k x3) (< k x4)) (= (findIdx x1 x2 x3 x4 k) 3))))
        (check-synth)
        """
        )
        assertEquals("LIA", problem.theory)
        assertEquals("findIdx", problem.funcName)
        assertEquals("((y1 Int) (y2 Int) (y3 Int) (y4 Int) (k1 Int)) Int", problem.funcSignature.toString())
        assertEquals(10, problem.constraints.size)
        assertEquals("(declare-var x1 Int)", problem.constraints[0])
        assertEquals(
            "(constraint (=> (and (< x1 x2) (and (< x2 x3) (< x3 x4))) (=> (and (> k x3) (< k x4)) (= (findIdx x1 x2 x3 x4 k) 3))))",
            problem.constraints[9]
        )
        assertEquals(
            listOf(
                Term("0"), Term("1"), Term("2"), Term("3"),
                Term("4"), Term("y1"), Term("y2"), Term("y3"),
                Term("y4"), Term("k1"), Term("ite", "BoolExpr", "Start", "Start"),
            ), problem.grammar.produRules["Start"]
        )
        assertEquals(
            listOf(
                Term("<", "Start", "Start"),
                Term("<=", "Start", "Start"),
                Term(">", "Start", "Start"),
                Term(">=", "Start", "Start"),
            ), problem.grammar.produRules["BoolExpr"]
        )
    }
}