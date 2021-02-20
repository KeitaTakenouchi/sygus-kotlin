// Generated from /home/t-keita/development/sygus/sygus-kotlin/src/main/antlr4/Sygus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SygusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SygusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SygusParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SygusParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SygusParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SygusParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#setLogicCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetLogicCmd(SygusParser.SetLogicCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#cmdPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPlus(SygusParser.CmdPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#cmdPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPlusTail(SygusParser.CmdPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SygusParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#varDeclCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclCmd(SygusParser.VarDeclCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sortDefCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDefCmd(SygusParser.SortDefCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sortExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortExpr(SygusParser.SortExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#intConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(SygusParser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(SygusParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#bVConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBVConst(SygusParser.BVConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#enumConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConst(SygusParser.EnumConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#realConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConst(SygusParser.RealConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#eCList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECList(SygusParser.ECListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPlus(SygusParser.SymbolPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPlusTail(SygusParser.SymbolPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#setOptsCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOptsCmd(SygusParser.SetOptsCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#optList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptList(SygusParser.OptListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolPairPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPairPlus(SygusParser.SymbolPairPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolPairPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPairPlusTail(SygusParser.SymbolPairPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPair(SygusParser.SymbolPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#funDefCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefCmd(SygusParser.FunDefCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#funDeclCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclCmd(SygusParser.FunDeclCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#sortStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortStar(SygusParser.SortStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(SygusParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolSortPairStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolSortPairStar(SygusParser.SymbolSortPairStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#symbolSortPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolSortPair(SygusParser.SymbolSortPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SygusParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetTerm(SygusParser.LetTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letBindingTermPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingTermPlus(SygusParser.LetBindingTermPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letBindingTermPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingTermPlusTail(SygusParser.LetBindingTermPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letBindingTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingTerm(SygusParser.LetBindingTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#termStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermStar(SygusParser.TermStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SygusParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#nTDefPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTDefPlus(SygusParser.NTDefPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#nTDefPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTDefPlusTail(SygusParser.NTDefPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#nTDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTDef(SygusParser.NTDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#gTermPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTermPlus(SygusParser.GTermPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#gTermPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTermPlusTail(SygusParser.GTermPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#checkSynthCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSynthCmd(SygusParser.CheckSynthCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#constraintCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintCmd(SygusParser.ConstraintCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#synthFunCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthFunCmd(SygusParser.SynthFunCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#gTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTerm(SygusParser.GTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letGTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetGTerm(SygusParser.LetGTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letBindingGTermPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingGTermPlus(SygusParser.LetBindingGTermPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letBindingGTermPlusTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingGTermPlusTail(SygusParser.LetBindingGTermPlusTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#letBindingGTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBindingGTerm(SygusParser.LetBindingGTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#gTermStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGTermStar(SygusParser.GTermStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#synthInvCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthInvCmd(SygusParser.SynthInvCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#declarePrimedVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarePrimedVar(SygusParser.DeclarePrimedVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#invConstraintCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvConstraintCmd(SygusParser.InvConstraintCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SygusParser#cliaGrammarCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCliaGrammarCmd(SygusParser.CliaGrammarCmdContext ctx);
}