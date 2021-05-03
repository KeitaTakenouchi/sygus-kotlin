// Generated from /home/t-keita/development/sygus/sygus-kotlin/src/main/antlr4/Sygus.g4 by ANTLR 4.9.1
package sygus.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SygusParser}.
 */
public interface SygusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SygusParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SygusParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SygusParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SygusParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SygusParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SygusParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SygusParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#setLogicCmd}.
	 * @param ctx the parse tree
	 */
	void enterSetLogicCmd(SygusParser.SetLogicCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#setLogicCmd}.
	 * @param ctx the parse tree
	 */
	void exitSetLogicCmd(SygusParser.SetLogicCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#cmdPlus}.
	 * @param ctx the parse tree
	 */
	void enterCmdPlus(SygusParser.CmdPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#cmdPlus}.
	 * @param ctx the parse tree
	 */
	void exitCmdPlus(SygusParser.CmdPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#cmdPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterCmdPlusTail(SygusParser.CmdPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#cmdPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitCmdPlusTail(SygusParser.CmdPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SygusParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SygusParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#varDeclCmd}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclCmd(SygusParser.VarDeclCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#varDeclCmd}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclCmd(SygusParser.VarDeclCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sortDefCmd}.
	 * @param ctx the parse tree
	 */
	void enterSortDefCmd(SygusParser.SortDefCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sortDefCmd}.
	 * @param ctx the parse tree
	 */
	void exitSortDefCmd(SygusParser.SortDefCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sortExpr}.
	 * @param ctx the parse tree
	 */
	void enterSortExpr(SygusParser.SortExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sortExpr}.
	 * @param ctx the parse tree
	 */
	void exitSortExpr(SygusParser.SortExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#intConst}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(SygusParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#intConst}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(SygusParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(SygusParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#boolConst}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(SygusParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#bVConst}.
	 * @param ctx the parse tree
	 */
	void enterBVConst(SygusParser.BVConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#bVConst}.
	 * @param ctx the parse tree
	 */
	void exitBVConst(SygusParser.BVConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#enumConst}.
	 * @param ctx the parse tree
	 */
	void enterEnumConst(SygusParser.EnumConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#enumConst}.
	 * @param ctx the parse tree
	 */
	void exitEnumConst(SygusParser.EnumConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#realConst}.
	 * @param ctx the parse tree
	 */
	void enterRealConst(SygusParser.RealConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#realConst}.
	 * @param ctx the parse tree
	 */
	void exitRealConst(SygusParser.RealConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#eCList}.
	 * @param ctx the parse tree
	 */
	void enterECList(SygusParser.ECListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#eCList}.
	 * @param ctx the parse tree
	 */
	void exitECList(SygusParser.ECListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolPlus}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPlus(SygusParser.SymbolPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolPlus}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPlus(SygusParser.SymbolPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPlusTail(SygusParser.SymbolPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPlusTail(SygusParser.SymbolPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#setOptsCmd}.
	 * @param ctx the parse tree
	 */
	void enterSetOptsCmd(SygusParser.SetOptsCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#setOptsCmd}.
	 * @param ctx the parse tree
	 */
	void exitSetOptsCmd(SygusParser.SetOptsCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#optList}.
	 * @param ctx the parse tree
	 */
	void enterOptList(SygusParser.OptListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#optList}.
	 * @param ctx the parse tree
	 */
	void exitOptList(SygusParser.OptListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolPairPlus}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPairPlus(SygusParser.SymbolPairPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolPairPlus}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPairPlus(SygusParser.SymbolPairPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolPairPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPairPlusTail(SygusParser.SymbolPairPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolPairPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPairPlusTail(SygusParser.SymbolPairPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolPair}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPair(SygusParser.SymbolPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolPair}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPair(SygusParser.SymbolPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#funDefCmd}.
	 * @param ctx the parse tree
	 */
	void enterFunDefCmd(SygusParser.FunDefCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#funDefCmd}.
	 * @param ctx the parse tree
	 */
	void exitFunDefCmd(SygusParser.FunDefCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#funDeclCmd}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclCmd(SygusParser.FunDeclCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#funDeclCmd}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclCmd(SygusParser.FunDeclCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#sortStar}.
	 * @param ctx the parse tree
	 */
	void enterSortStar(SygusParser.SortStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#sortStar}.
	 * @param ctx the parse tree
	 */
	void exitSortStar(SygusParser.SortStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(SygusParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(SygusParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolSortPairStar}.
	 * @param ctx the parse tree
	 */
	void enterSymbolSortPairStar(SygusParser.SymbolSortPairStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolSortPairStar}.
	 * @param ctx the parse tree
	 */
	void exitSymbolSortPairStar(SygusParser.SymbolSortPairStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#symbolSortPair}.
	 * @param ctx the parse tree
	 */
	void enterSymbolSortPair(SygusParser.SymbolSortPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#symbolSortPair}.
	 * @param ctx the parse tree
	 */
	void exitSymbolSortPair(SygusParser.SymbolSortPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SygusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SygusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetTerm(SygusParser.LetTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetTerm(SygusParser.LetTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letBindingTermPlus}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingTermPlus(SygusParser.LetBindingTermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letBindingTermPlus}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingTermPlus(SygusParser.LetBindingTermPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letBindingTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingTermPlusTail(SygusParser.LetBindingTermPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letBindingTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingTermPlusTail(SygusParser.LetBindingTermPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letBindingTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingTerm(SygusParser.LetBindingTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letBindingTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingTerm(SygusParser.LetBindingTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#termStar}.
	 * @param ctx the parse tree
	 */
	void enterTermStar(SygusParser.TermStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#termStar}.
	 * @param ctx the parse tree
	 */
	void exitTermStar(SygusParser.TermStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SygusParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SygusParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#nTDefPlus}.
	 * @param ctx the parse tree
	 */
	void enterNTDefPlus(SygusParser.NTDefPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#nTDefPlus}.
	 * @param ctx the parse tree
	 */
	void exitNTDefPlus(SygusParser.NTDefPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#nTDefPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterNTDefPlusTail(SygusParser.NTDefPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#nTDefPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitNTDefPlusTail(SygusParser.NTDefPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#nTDef}.
	 * @param ctx the parse tree
	 */
	void enterNTDef(SygusParser.NTDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#nTDef}.
	 * @param ctx the parse tree
	 */
	void exitNTDef(SygusParser.NTDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#gTermPlus}.
	 * @param ctx the parse tree
	 */
	void enterGTermPlus(SygusParser.GTermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#gTermPlus}.
	 * @param ctx the parse tree
	 */
	void exitGTermPlus(SygusParser.GTermPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#gTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterGTermPlusTail(SygusParser.GTermPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#gTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitGTermPlusTail(SygusParser.GTermPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#checkSynthCmd}.
	 * @param ctx the parse tree
	 */
	void enterCheckSynthCmd(SygusParser.CheckSynthCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#checkSynthCmd}.
	 * @param ctx the parse tree
	 */
	void exitCheckSynthCmd(SygusParser.CheckSynthCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#constraintCmd}.
	 * @param ctx the parse tree
	 */
	void enterConstraintCmd(SygusParser.ConstraintCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#constraintCmd}.
	 * @param ctx the parse tree
	 */
	void exitConstraintCmd(SygusParser.ConstraintCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#synthFunCmd}.
	 * @param ctx the parse tree
	 */
	void enterSynthFunCmd(SygusParser.SynthFunCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#synthFunCmd}.
	 * @param ctx the parse tree
	 */
	void exitSynthFunCmd(SygusParser.SynthFunCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterSymbolTerm(SygusParser.SymbolTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitSymbolTerm(SygusParser.SymbolTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(SygusParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(SygusParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterFuncTerm(SygusParser.FuncTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitFuncTerm(SygusParser.FuncTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterConstTerm(SygusParser.ConstTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitConstTerm(SygusParser.ConstTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterVarTerm(SygusParser.VarTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarTerm}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitVarTerm(SygusParser.VarTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code t3}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterT3(SygusParser.T3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code t3}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitT3(SygusParser.T3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code t4}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterT4(SygusParser.T4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code t4}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitT4(SygusParser.T4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code t5}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void enterT5(SygusParser.T5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code t5}
	 * labeled alternative in {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 */
	void exitT5(SygusParser.T5Context ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letGTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetGTerm(SygusParser.LetGTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letGTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetGTerm(SygusParser.LetGTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letBindingGTermPlus}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingGTermPlus(SygusParser.LetBindingGTermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letBindingGTermPlus}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingGTermPlus(SygusParser.LetBindingGTermPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letBindingGTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingGTermPlusTail(SygusParser.LetBindingGTermPlusTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letBindingGTermPlusTail}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingGTermPlusTail(SygusParser.LetBindingGTermPlusTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#letBindingGTerm}.
	 * @param ctx the parse tree
	 */
	void enterLetBindingGTerm(SygusParser.LetBindingGTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#letBindingGTerm}.
	 * @param ctx the parse tree
	 */
	void exitLetBindingGTerm(SygusParser.LetBindingGTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#gTermStar}.
	 * @param ctx the parse tree
	 */
	void enterGTermStar(SygusParser.GTermStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#gTermStar}.
	 * @param ctx the parse tree
	 */
	void exitGTermStar(SygusParser.GTermStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#synthInvCmd}.
	 * @param ctx the parse tree
	 */
	void enterSynthInvCmd(SygusParser.SynthInvCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#synthInvCmd}.
	 * @param ctx the parse tree
	 */
	void exitSynthInvCmd(SygusParser.SynthInvCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#declarePrimedVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarePrimedVar(SygusParser.DeclarePrimedVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#declarePrimedVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarePrimedVar(SygusParser.DeclarePrimedVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#invConstraintCmd}.
	 * @param ctx the parse tree
	 */
	void enterInvConstraintCmd(SygusParser.InvConstraintCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#invConstraintCmd}.
	 * @param ctx the parse tree
	 */
	void exitInvConstraintCmd(SygusParser.InvConstraintCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SygusParser#cliaGrammarCmd}.
	 * @param ctx the parse tree
	 */
	void enterCliaGrammarCmd(SygusParser.CliaGrammarCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SygusParser#cliaGrammarCmd}.
	 * @param ctx the parse tree
	 */
	void exitCliaGrammarCmd(SygusParser.CliaGrammarCmdContext ctx);
}