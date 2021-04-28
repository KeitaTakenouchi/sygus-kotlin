import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import sygus.antlr.*

fun main() {
    run {
        val fileName = "benchmarks/sygus-comp-2017/max2.sl"

        val charStream = CharStreams.fromFileName(fileName)
        val lexer = SygusLexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SygusParser(tokenStream)

        val tree = parser.start()
        val walker = ParseTreeWalker.DEFAULT
        walker.walk(SyGusPrintVisitor(), tree)
    }

    run {
        val fileName = "included/Core.smt2"

        val charStream = CharStreams.fromFileName(fileName)
        val lexer = SMTLIBv2Lexer(charStream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = SMTLIBv2Parser(tokenStream)

        val tree = parser.theory_decl()
        val walker = ParseTreeWalker.DEFAULT
        walker.walk(SMTLIBv2PrintVisitor(), tree)
    }

}