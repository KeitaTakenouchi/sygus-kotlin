import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import sygus.antlr.PrintVisitor
import sygus.antlr.SygusLexer
import sygus.antlr.SygusParser

fun main() {
    val fileName = "benchmarks/sygus-comp-2017/max2.sl"

    val charStream = CharStreams.fromFileName(fileName)
    val lexer = SygusLexer(charStream)
    val tokenStream = CommonTokenStream(lexer)
    val parser = SygusParser(tokenStream)

    val tree = parser.start()
    val walker = ParseTreeWalker.DEFAULT
    walker.walk(PrintVisitor(), tree)
}