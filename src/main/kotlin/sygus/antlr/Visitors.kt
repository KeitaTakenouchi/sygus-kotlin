package sygus.antlr

import org.antlr.v4.runtime.tree.TerminalNode

class SyGusPrintVisitor : SygusBaseListener() {

    override fun enterNTDef(ctx: SygusParser.NTDefContext?) {
        super.enterNTDef(ctx)
        println()
        print("\t")
    }

    override fun exitSetLogicCmd(ctx: SygusParser.SetLogicCmdContext?) {
        println()
    }

    override fun exitCmd(ctx: SygusParser.CmdContext?) {
        println()
    }

    override fun visitTerminal(node: TerminalNode?) {
        print(node!!.text + " ")
    }
}

class SMTLIBv2PrintVisitor : SMTLIBv2BaseListener() {
    override fun visitTerminal(node: TerminalNode?) {
        print(node!!.text + " ")
    }
}