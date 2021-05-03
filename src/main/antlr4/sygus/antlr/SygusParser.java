// Generated from /home/t-keita/development/sygus/sygus-kotlin/src/main/antlr4/Sygus.g4 by ANTLR 4.9.1
package sygus.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SygusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, WS=30, COMMENT=31, INTEGER=32, 
		BVCONST=33, REALCONST=34, QUOTEDLIT=35, SYMBOL=36;
	public static final int
		RULE_start = 0, RULE_prog = 1, RULE_symbol = 2, RULE_setLogicCmd = 3, 
		RULE_cmdPlus = 4, RULE_cmdPlusTail = 5, RULE_cmd = 6, RULE_varDeclCmd = 7, 
		RULE_sortDefCmd = 8, RULE_sortExpr = 9, RULE_intConst = 10, RULE_boolConst = 11, 
		RULE_bVConst = 12, RULE_enumConst = 13, RULE_realConst = 14, RULE_eCList = 15, 
		RULE_symbolPlus = 16, RULE_symbolPlusTail = 17, RULE_setOptsCmd = 18, 
		RULE_optList = 19, RULE_symbolPairPlus = 20, RULE_symbolPairPlusTail = 21, 
		RULE_symbolPair = 22, RULE_funDefCmd = 23, RULE_funDeclCmd = 24, RULE_sortStar = 25, 
		RULE_argList = 26, RULE_symbolSortPairStar = 27, RULE_symbolSortPair = 28, 
		RULE_term = 29, RULE_letTerm = 30, RULE_letBindingTermPlus = 31, RULE_letBindingTermPlusTail = 32, 
		RULE_letBindingTerm = 33, RULE_termStar = 34, RULE_literal = 35, RULE_nTDefPlus = 36, 
		RULE_nTDefPlusTail = 37, RULE_nTDef = 38, RULE_gTermPlus = 39, RULE_gTermPlusTail = 40, 
		RULE_checkSynthCmd = 41, RULE_constraintCmd = 42, RULE_synthFunCmd = 43, 
		RULE_gTerm = 44, RULE_letGTerm = 45, RULE_letBindingGTermPlus = 46, RULE_letBindingGTermPlusTail = 47, 
		RULE_letBindingGTerm = 48, RULE_gTermStar = 49, RULE_synthInvCmd = 50, 
		RULE_declarePrimedVar = 51, RULE_invConstraintCmd = 52, RULE_cliaGrammarCmd = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "prog", "symbol", "setLogicCmd", "cmdPlus", "cmdPlusTail", "cmd", 
			"varDeclCmd", "sortDefCmd", "sortExpr", "intConst", "boolConst", "bVConst", 
			"enumConst", "realConst", "eCList", "symbolPlus", "symbolPlusTail", "setOptsCmd", 
			"optList", "symbolPairPlus", "symbolPairPlusTail", "symbolPair", "funDefCmd", 
			"funDeclCmd", "sortStar", "argList", "symbolSortPairStar", "symbolSortPair", 
			"term", "letTerm", "letBindingTermPlus", "letBindingTermPlusTail", "letBindingTerm", 
			"termStar", "literal", "nTDefPlus", "nTDefPlusTail", "nTDef", "gTermPlus", 
			"gTermPlusTail", "checkSynthCmd", "constraintCmd", "synthFunCmd", "gTerm", 
			"letGTerm", "letBindingGTermPlus", "letBindingGTermPlusTail", "letBindingGTerm", 
			"gTermStar", "synthInvCmd", "declarePrimedVar", "invConstraintCmd", "cliaGrammarCmd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'set-logic'", "')'", "'declare-var'", "'define-sort'", 
			"'BitVec'", "'Int'", "'Bool'", "'Real'", "'Enum'", "'Array'", "'true'", 
			"'false'", "'::'", "'set-options'", "'define-fun'", "'declare-fun'", 
			"'let'", "'check-synth'", "'constraint'", "'synth-fun'", "'Constant'", 
			"'Variable'", "'InputVariable'", "'LocalVariable'", "'synth-inv'", "'declare-primed-var'", 
			"'inv-constraint'", "'clia-grammar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "COMMENT", "INTEGER", "BVCONST", 
			"REALCONST", "QUOTEDLIT", "SYMBOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sygus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SygusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				prog();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public SetLogicCmdContext setLogicCmd() {
			return getRuleContext(SetLogicCmdContext.class,0);
		}
		public CmdPlusContext cmdPlus() {
			return getRuleContext(CmdPlusContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				setLogicCmd();
				setState(113);
				cmdPlus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				cmdPlus();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(SygusParser.SYMBOL, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetLogicCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SetLogicCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLogicCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSetLogicCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSetLogicCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSetLogicCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetLogicCmdContext setLogicCmd() throws RecognitionException {
		SetLogicCmdContext _localctx = new SetLogicCmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setLogicCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__0);
			setState(121);
			match(T__1);
			setState(122);
			symbol();
			setState(123);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPlusContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdPlusTailContext cmdPlusTail() {
			return getRuleContext(CmdPlusTailContext.class,0);
		}
		public CmdPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterCmdPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitCmdPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitCmdPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdPlusContext cmdPlus() throws RecognitionException {
		CmdPlusContext _localctx = new CmdPlusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			cmd();
			setState(126);
			cmdPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdPlusTailContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdPlusTailContext cmdPlusTail() {
			return getRuleContext(CmdPlusTailContext.class,0);
		}
		public CmdPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterCmdPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitCmdPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitCmdPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdPlusTailContext cmdPlusTail() throws RecognitionException {
		CmdPlusTailContext _localctx = new CmdPlusTailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdPlusTail);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				cmd();
				setState(129);
				cmdPlusTail();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public FunDefCmdContext funDefCmd() {
			return getRuleContext(FunDefCmdContext.class,0);
		}
		public FunDeclCmdContext funDeclCmd() {
			return getRuleContext(FunDeclCmdContext.class,0);
		}
		public SynthFunCmdContext synthFunCmd() {
			return getRuleContext(SynthFunCmdContext.class,0);
		}
		public CheckSynthCmdContext checkSynthCmd() {
			return getRuleContext(CheckSynthCmdContext.class,0);
		}
		public ConstraintCmdContext constraintCmd() {
			return getRuleContext(ConstraintCmdContext.class,0);
		}
		public SortDefCmdContext sortDefCmd() {
			return getRuleContext(SortDefCmdContext.class,0);
		}
		public SetOptsCmdContext setOptsCmd() {
			return getRuleContext(SetOptsCmdContext.class,0);
		}
		public VarDeclCmdContext varDeclCmd() {
			return getRuleContext(VarDeclCmdContext.class,0);
		}
		public SynthInvCmdContext synthInvCmd() {
			return getRuleContext(SynthInvCmdContext.class,0);
		}
		public DeclarePrimedVarContext declarePrimedVar() {
			return getRuleContext(DeclarePrimedVarContext.class,0);
		}
		public InvConstraintCmdContext invConstraintCmd() {
			return getRuleContext(InvConstraintCmdContext.class,0);
		}
		public CliaGrammarCmdContext cliaGrammarCmd() {
			return getRuleContext(CliaGrammarCmdContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				funDefCmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				funDeclCmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				synthFunCmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				checkSynthCmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				constraintCmd();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				sortDefCmd();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				setOptsCmd();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				varDeclCmd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				synthInvCmd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				declarePrimedVar();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				invConstraintCmd();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				cliaGrammarCmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public VarDeclCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterVarDeclCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitVarDeclCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitVarDeclCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclCmdContext varDeclCmd() throws RecognitionException {
		VarDeclCmdContext _localctx = new VarDeclCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__0);
			setState(149);
			match(T__3);
			setState(150);
			symbol();
			setState(151);
			sortExpr();
			setState(152);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortDefCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public SortDefCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDefCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSortDefCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSortDefCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSortDefCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortDefCmdContext sortDefCmd() throws RecognitionException {
		SortDefCmdContext _localctx = new SortDefCmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sortDefCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__0);
			setState(155);
			match(T__4);
			setState(156);
			symbol();
			setState(157);
			sortExpr();
			setState(158);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortExprContext extends ParserRuleContext {
		public SortExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortExpr; }
	 
		public SortExprContext() { }
		public void copyFrom(SortExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class S3Context extends SortExprContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public S3Context(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterS3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitS3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitS3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitVecSortContext extends SortExprContext {
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public BitVecSortContext(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterBitVecSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitBitVecSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitBitVecSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealSortContext extends SortExprContext {
		public RealSortContext(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterRealSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitRealSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitRealSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntSortContext extends SortExprContext {
		public IntSortContext(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterIntSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitIntSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitIntSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolSortContext extends SortExprContext {
		public BoolSortContext(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterBoolSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitBoolSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitBoolSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class S1Context extends SortExprContext {
		public ECListContext eCList() {
			return getRuleContext(ECListContext.class,0);
		}
		public S1Context(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterS1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitS1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitS1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class S2Context extends SortExprContext {
		public List<SortExprContext> sortExpr() {
			return getRuleContexts(SortExprContext.class);
		}
		public SortExprContext sortExpr(int i) {
			return getRuleContext(SortExprContext.class,i);
		}
		public S2Context(SortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterS2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitS2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitS2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortExprContext sortExpr() throws RecognitionException {
		SortExprContext _localctx = new SortExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sortExpr);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BitVecSortContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__0);
				setState(161);
				match(T__5);
				setState(162);
				intConst();
				setState(163);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new IntSortContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__6);
				}
				break;
			case 3:
				_localctx = new BoolSortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new RealSortContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(T__8);
				}
				break;
			case 5:
				_localctx = new S1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(T__0);
				setState(169);
				match(T__9);
				setState(170);
				eCList();
				setState(171);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new S2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(T__0);
				setState(174);
				match(T__10);
				setState(175);
				sortExpr();
				setState(176);
				sortExpr();
				setState(177);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new S3Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				symbol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntConstContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SygusParser.INTEGER, 0); }
		public IntConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitIntConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitIntConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntConstContext intConst() throws RecognitionException {
		IntConstContext _localctx = new IntConstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolConstContext extends ParserRuleContext {
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BVConstContext extends ParserRuleContext {
		public TerminalNode BVCONST() { return getToken(SygusParser.BVCONST, 0); }
		public BVConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bVConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterBVConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitBVConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitBVConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BVConstContext bVConst() throws RecognitionException {
		BVConstContext _localctx = new BVConstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bVConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(BVCONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public EnumConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterEnumConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitEnumConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitEnumConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstContext enumConst() throws RecognitionException {
		EnumConstContext _localctx = new EnumConstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			symbol();
			setState(189);
			match(T__13);
			setState(190);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealConstContext extends ParserRuleContext {
		public TerminalNode REALCONST() { return getToken(SygusParser.REALCONST, 0); }
		public RealConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterRealConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitRealConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitRealConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealConstContext realConst() throws RecognitionException {
		RealConstContext _localctx = new RealConstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_realConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(REALCONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ECListContext extends ParserRuleContext {
		public SymbolPlusContext symbolPlus() {
			return getRuleContext(SymbolPlusContext.class,0);
		}
		public ECListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eCList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterECList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitECList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitECList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ECListContext eCList() throws RecognitionException {
		ECListContext _localctx = new ECListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eCList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__0);
			setState(195);
			symbolPlus();
			setState(196);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolPlusContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolPlusTailContext symbolPlusTail() {
			return getRuleContext(SymbolPlusTailContext.class,0);
		}
		public SymbolPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolPlusContext symbolPlus() throws RecognitionException {
		SymbolPlusContext _localctx = new SymbolPlusContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_symbolPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			symbol();
			setState(199);
			symbolPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolPlusTailContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolPlusTailContext symbolPlusTail() {
			return getRuleContext(SymbolPlusTailContext.class,0);
		}
		public SymbolPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolPlusTailContext symbolPlusTail() throws RecognitionException {
		SymbolPlusTailContext _localctx = new SymbolPlusTailContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_symbolPlusTail);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				symbol();
				setState(202);
				symbolPlusTail();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetOptsCmdContext extends ParserRuleContext {
		public OptListContext optList() {
			return getRuleContext(OptListContext.class,0);
		}
		public SetOptsCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOptsCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSetOptsCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSetOptsCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSetOptsCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetOptsCmdContext setOptsCmd() throws RecognitionException {
		SetOptsCmdContext _localctx = new SetOptsCmdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setOptsCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__0);
			setState(208);
			match(T__14);
			setState(209);
			optList();
			setState(210);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptListContext extends ParserRuleContext {
		public SymbolPairPlusContext symbolPairPlus() {
			return getRuleContext(SymbolPairPlusContext.class,0);
		}
		public OptListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterOptList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitOptList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitOptList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptListContext optList() throws RecognitionException {
		OptListContext _localctx = new OptListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__0);
			setState(213);
			symbolPairPlus();
			setState(214);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolPairPlusContext extends ParserRuleContext {
		public SymbolPairContext symbolPair() {
			return getRuleContext(SymbolPairContext.class,0);
		}
		public SymbolPairPlusTailContext symbolPairPlusTail() {
			return getRuleContext(SymbolPairPlusTailContext.class,0);
		}
		public SymbolPairPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolPairPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolPairPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolPairPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolPairPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolPairPlusContext symbolPairPlus() throws RecognitionException {
		SymbolPairPlusContext _localctx = new SymbolPairPlusContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_symbolPairPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			symbolPair();
			setState(217);
			symbolPairPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolPairPlusTailContext extends ParserRuleContext {
		public SymbolPairContext symbolPair() {
			return getRuleContext(SymbolPairContext.class,0);
		}
		public SymbolPairPlusTailContext symbolPairPlusTail() {
			return getRuleContext(SymbolPairPlusTailContext.class,0);
		}
		public SymbolPairPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolPairPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolPairPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolPairPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolPairPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolPairPlusTailContext symbolPairPlusTail() throws RecognitionException {
		SymbolPairPlusTailContext _localctx = new SymbolPairPlusTailContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_symbolPairPlusTail);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				symbolPair();
				setState(220);
				symbolPairPlusTail();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolPairContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode QUOTEDLIT() { return getToken(SygusParser.QUOTEDLIT, 0); }
		public SymbolPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolPairContext symbolPair() throws RecognitionException {
		SymbolPairContext _localctx = new SymbolPairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_symbolPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__0);
			setState(226);
			symbol();
			setState(227);
			match(QUOTEDLIT);
			setState(228);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FunDefCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterFunDefCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitFunDefCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitFunDefCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefCmdContext funDefCmd() throws RecognitionException {
		FunDefCmdContext _localctx = new FunDefCmdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_funDefCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__0);
			setState(231);
			match(T__15);
			setState(232);
			symbol();
			setState(233);
			argList();
			setState(234);
			sortExpr();
			setState(235);
			term();
			setState(236);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDeclCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortStarContext sortStar() {
			return getRuleContext(SortStarContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public FunDeclCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterFunDeclCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitFunDeclCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitFunDeclCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclCmdContext funDeclCmd() throws RecognitionException {
		FunDeclCmdContext _localctx = new FunDeclCmdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funDeclCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__0);
			setState(239);
			match(T__16);
			setState(240);
			symbol();
			setState(241);
			match(T__0);
			setState(242);
			sortStar();
			setState(243);
			match(T__2);
			setState(244);
			sortExpr();
			setState(245);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortStarContext extends ParserRuleContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public SortStarContext sortStar() {
			return getRuleContext(SortStarContext.class,0);
		}
		public SortStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSortStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSortStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSortStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortStarContext sortStar() throws RecognitionException {
		SortStarContext _localctx = new SortStarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sortStar);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__6:
			case T__7:
			case T__8:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				sortExpr();
				setState(248);
				sortStar();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public SymbolSortPairStarContext symbolSortPairStar() {
			return getRuleContext(SymbolSortPairStarContext.class,0);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__0);
			setState(254);
			symbolSortPairStar();
			setState(255);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolSortPairStarContext extends ParserRuleContext {
		public SymbolSortPairContext symbolSortPair() {
			return getRuleContext(SymbolSortPairContext.class,0);
		}
		public SymbolSortPairStarContext symbolSortPairStar() {
			return getRuleContext(SymbolSortPairStarContext.class,0);
		}
		public SymbolSortPairStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolSortPairStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolSortPairStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolSortPairStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolSortPairStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolSortPairStarContext symbolSortPairStar() throws RecognitionException {
		SymbolSortPairStarContext _localctx = new SymbolSortPairStarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_symbolSortPairStar);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				symbolSortPair();
				setState(258);
				symbolSortPairStar();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolSortPairContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public SymbolSortPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolSortPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolSortPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolSortPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolSortPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolSortPairContext symbolSortPair() throws RecognitionException {
		SymbolSortPairContext _localctx = new SymbolSortPairContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_symbolSortPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__0);
			setState(264);
			symbol();
			setState(265);
			sortExpr();
			setState(266);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TermStarContext termStar() {
			return getRuleContext(TermStarContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LetTermContext letTerm() {
			return getRuleContext(LetTermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_term);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__0);
				setState(269);
				symbol();
				setState(270);
				termStar();
				setState(271);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				symbol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				letTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetTermContext extends ParserRuleContext {
		public LetBindingTermPlusContext letBindingTermPlus() {
			return getRuleContext(LetBindingTermPlusContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LetTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetTermContext letTerm() throws RecognitionException {
		LetTermContext _localctx = new LetTermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_letTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__0);
			setState(279);
			match(T__17);
			setState(280);
			match(T__0);
			setState(281);
			letBindingTermPlus();
			setState(282);
			match(T__2);
			setState(283);
			term();
			setState(284);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingTermPlusContext extends ParserRuleContext {
		public LetBindingTermContext letBindingTerm() {
			return getRuleContext(LetBindingTermContext.class,0);
		}
		public LetBindingTermPlusTailContext letBindingTermPlusTail() {
			return getRuleContext(LetBindingTermPlusTailContext.class,0);
		}
		public LetBindingTermPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingTermPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetBindingTermPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetBindingTermPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetBindingTermPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingTermPlusContext letBindingTermPlus() throws RecognitionException {
		LetBindingTermPlusContext _localctx = new LetBindingTermPlusContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_letBindingTermPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			letBindingTerm();
			setState(287);
			letBindingTermPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingTermPlusTailContext extends ParserRuleContext {
		public LetBindingTermContext letBindingTerm() {
			return getRuleContext(LetBindingTermContext.class,0);
		}
		public LetBindingTermPlusTailContext letBindingTermPlusTail() {
			return getRuleContext(LetBindingTermPlusTailContext.class,0);
		}
		public LetBindingTermPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingTermPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetBindingTermPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetBindingTermPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetBindingTermPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingTermPlusTailContext letBindingTermPlusTail() throws RecognitionException {
		LetBindingTermPlusTailContext _localctx = new LetBindingTermPlusTailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_letBindingTermPlusTail);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				letBindingTerm();
				setState(290);
				letBindingTermPlusTail();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingTermContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LetBindingTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetBindingTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetBindingTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetBindingTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingTermContext letBindingTerm() throws RecognitionException {
		LetBindingTermContext _localctx = new LetBindingTermContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_letBindingTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__0);
			setState(296);
			symbol();
			setState(297);
			sortExpr();
			setState(298);
			term();
			setState(299);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermStarContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermStarContext termStar() {
			return getRuleContext(TermStarContext.class,0);
		}
		public TermStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterTermStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitTermStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitTermStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermStarContext termStar() throws RecognitionException {
		TermStarContext _localctx = new TermStarContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termStar);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case INTEGER:
			case BVCONST:
			case REALCONST:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				term();
				setState(302);
				termStar();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntConstContext intConst() {
			return getRuleContext(IntConstContext.class,0);
		}
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public BVConstContext bVConst() {
			return getRuleContext(BVConstContext.class,0);
		}
		public EnumConstContext enumConst() {
			return getRuleContext(EnumConstContext.class,0);
		}
		public RealConstContext realConst() {
			return getRuleContext(RealConstContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				intConst();
				}
				break;
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				boolConst();
				}
				break;
			case BVCONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				bVConst();
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				enumConst();
				}
				break;
			case REALCONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				realConst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NTDefPlusContext extends ParserRuleContext {
		public NTDefContext nTDef() {
			return getRuleContext(NTDefContext.class,0);
		}
		public NTDefPlusTailContext nTDefPlusTail() {
			return getRuleContext(NTDefPlusTailContext.class,0);
		}
		public NTDefPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nTDefPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterNTDefPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitNTDefPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitNTDefPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NTDefPlusContext nTDefPlus() throws RecognitionException {
		NTDefPlusContext _localctx = new NTDefPlusContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nTDefPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			nTDef();
			setState(315);
			nTDefPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NTDefPlusTailContext extends ParserRuleContext {
		public NTDefContext nTDef() {
			return getRuleContext(NTDefContext.class,0);
		}
		public NTDefPlusTailContext nTDefPlusTail() {
			return getRuleContext(NTDefPlusTailContext.class,0);
		}
		public NTDefPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nTDefPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterNTDefPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitNTDefPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitNTDefPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NTDefPlusTailContext nTDefPlusTail() throws RecognitionException {
		NTDefPlusTailContext _localctx = new NTDefPlusTailContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nTDefPlusTail);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				nTDef();
				setState(318);
				nTDefPlusTail();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NTDefContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public GTermPlusContext gTermPlus() {
			return getRuleContext(GTermPlusContext.class,0);
		}
		public NTDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nTDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterNTDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitNTDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitNTDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NTDefContext nTDef() throws RecognitionException {
		NTDefContext _localctx = new NTDefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nTDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__0);
			setState(324);
			symbol();
			setState(325);
			sortExpr();
			setState(326);
			match(T__0);
			setState(327);
			gTermPlus();
			setState(328);
			match(T__2);
			setState(329);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GTermPlusContext extends ParserRuleContext {
		public GTermContext gTerm() {
			return getRuleContext(GTermContext.class,0);
		}
		public GTermPlusTailContext gTermPlusTail() {
			return getRuleContext(GTermPlusTailContext.class,0);
		}
		public GTermPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gTermPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterGTermPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitGTermPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitGTermPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GTermPlusContext gTermPlus() throws RecognitionException {
		GTermPlusContext _localctx = new GTermPlusContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_gTermPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			gTerm();
			setState(332);
			gTermPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GTermPlusTailContext extends ParserRuleContext {
		public GTermContext gTerm() {
			return getRuleContext(GTermContext.class,0);
		}
		public GTermPlusTailContext gTermPlusTail() {
			return getRuleContext(GTermPlusTailContext.class,0);
		}
		public GTermPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gTermPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterGTermPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitGTermPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitGTermPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GTermPlusTailContext gTermPlusTail() throws RecognitionException {
		GTermPlusTailContext _localctx = new GTermPlusTailContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_gTermPlusTail);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case INTEGER:
			case BVCONST:
			case REALCONST:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				gTerm();
				setState(335);
				gTermPlusTail();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckSynthCmdContext extends ParserRuleContext {
		public CheckSynthCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSynthCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterCheckSynthCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitCheckSynthCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitCheckSynthCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckSynthCmdContext checkSynthCmd() throws RecognitionException {
		CheckSynthCmdContext _localctx = new CheckSynthCmdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_checkSynthCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__0);
			setState(341);
			match(T__18);
			setState(342);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintCmdContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConstraintCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterConstraintCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitConstraintCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitConstraintCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintCmdContext constraintCmd() throws RecognitionException {
		ConstraintCmdContext _localctx = new ConstraintCmdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constraintCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__0);
			setState(345);
			match(T__19);
			setState(346);
			term();
			setState(347);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthFunCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public NTDefPlusContext nTDefPlus() {
			return getRuleContext(NTDefPlusContext.class,0);
		}
		public SynthFunCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthFunCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSynthFunCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSynthFunCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSynthFunCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthFunCmdContext synthFunCmd() throws RecognitionException {
		SynthFunCmdContext _localctx = new SynthFunCmdContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_synthFunCmd);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(T__0);
				setState(350);
				match(T__20);
				setState(351);
				symbol();
				setState(352);
				argList();
				setState(353);
				sortExpr();
				setState(354);
				match(T__0);
				setState(355);
				nTDefPlus();
				setState(356);
				match(T__2);
				setState(357);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(T__0);
				setState(360);
				match(T__20);
				setState(361);
				symbol();
				setState(362);
				argList();
				setState(363);
				sortExpr();
				setState(364);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GTermContext extends ParserRuleContext {
		public GTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gTerm; }
	 
		public GTermContext() { }
		public void copyFrom(GTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class T4Context extends GTermContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public T4Context(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterT4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitT4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitT4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T5Context extends GTermContext {
		public LetGTermContext letGTerm() {
			return getRuleContext(LetGTermContext.class,0);
		}
		public T5Context(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterT5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitT5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitT5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralTermContext extends GTermContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralTermContext(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLiteralTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLiteralTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolTermContext extends GTermContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolTermContext(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSymbolTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSymbolTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSymbolTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncTermContext extends GTermContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public GTermStarContext gTermStar() {
			return getRuleContext(GTermStarContext.class,0);
		}
		public FuncTermContext(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterFuncTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitFuncTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitFuncTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstTermContext extends GTermContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public ConstTermContext(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterConstTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitConstTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitConstTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarTermContext extends GTermContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public VarTermContext(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterVarTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitVarTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitVarTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class T3Context extends GTermContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public T3Context(GTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterT3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitT3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitT3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GTermContext gTerm() throws RecognitionException {
		GTermContext _localctx = new GTermContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_gTerm);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SymbolTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				symbol();
				}
				break;
			case 2:
				_localctx = new LiteralTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				literal();
				}
				break;
			case 3:
				_localctx = new FuncTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(T__0);
				setState(371);
				symbol();
				setState(372);
				gTermStar();
				setState(373);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new ConstTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				match(T__0);
				setState(376);
				match(T__21);
				setState(377);
				sortExpr();
				setState(378);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new VarTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				match(T__0);
				setState(381);
				match(T__22);
				setState(382);
				sortExpr();
				setState(383);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new T3Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				match(T__0);
				setState(386);
				match(T__23);
				setState(387);
				sortExpr();
				setState(388);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new T4Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				match(T__0);
				setState(391);
				match(T__24);
				setState(392);
				sortExpr();
				setState(393);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new T5Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(395);
				letGTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetGTermContext extends ParserRuleContext {
		public LetBindingGTermPlusContext letBindingGTermPlus() {
			return getRuleContext(LetBindingGTermPlusContext.class,0);
		}
		public GTermContext gTerm() {
			return getRuleContext(GTermContext.class,0);
		}
		public LetGTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letGTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetGTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetGTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetGTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetGTermContext letGTerm() throws RecognitionException {
		LetGTermContext _localctx = new LetGTermContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_letGTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__0);
			setState(399);
			match(T__17);
			setState(400);
			match(T__0);
			setState(401);
			letBindingGTermPlus();
			setState(402);
			match(T__2);
			setState(403);
			gTerm();
			setState(404);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingGTermPlusContext extends ParserRuleContext {
		public LetBindingGTermContext letBindingGTerm() {
			return getRuleContext(LetBindingGTermContext.class,0);
		}
		public LetBindingGTermPlusTailContext letBindingGTermPlusTail() {
			return getRuleContext(LetBindingGTermPlusTailContext.class,0);
		}
		public LetBindingGTermPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingGTermPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetBindingGTermPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetBindingGTermPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetBindingGTermPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingGTermPlusContext letBindingGTermPlus() throws RecognitionException {
		LetBindingGTermPlusContext _localctx = new LetBindingGTermPlusContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_letBindingGTermPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			letBindingGTerm();
			setState(407);
			letBindingGTermPlusTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingGTermPlusTailContext extends ParserRuleContext {
		public LetBindingGTermContext letBindingGTerm() {
			return getRuleContext(LetBindingGTermContext.class,0);
		}
		public LetBindingGTermPlusTailContext letBindingGTermPlusTail() {
			return getRuleContext(LetBindingGTermPlusTailContext.class,0);
		}
		public LetBindingGTermPlusTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingGTermPlusTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetBindingGTermPlusTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetBindingGTermPlusTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetBindingGTermPlusTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingGTermPlusTailContext letBindingGTermPlusTail() throws RecognitionException {
		LetBindingGTermPlusTailContext _localctx = new LetBindingGTermPlusTailContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_letBindingGTermPlusTail);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				letBindingGTerm();
				setState(410);
				letBindingGTermPlusTail();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingGTermContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public GTermContext gTerm() {
			return getRuleContext(GTermContext.class,0);
		}
		public LetBindingGTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingGTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterLetBindingGTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitLetBindingGTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitLetBindingGTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingGTermContext letBindingGTerm() throws RecognitionException {
		LetBindingGTermContext _localctx = new LetBindingGTermContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_letBindingGTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__0);
			setState(416);
			symbol();
			setState(417);
			sortExpr();
			setState(418);
			gTerm();
			setState(419);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GTermStarContext extends ParserRuleContext {
		public GTermContext gTerm() {
			return getRuleContext(GTermContext.class,0);
		}
		public GTermStarContext gTermStar() {
			return getRuleContext(GTermStarContext.class,0);
		}
		public GTermStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gTermStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterGTermStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitGTermStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitGTermStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GTermStarContext gTermStar() throws RecognitionException {
		GTermStarContext _localctx = new GTermStarContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gTermStar);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__11:
			case T__12:
			case INTEGER:
			case BVCONST:
			case REALCONST:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				gTerm();
				setState(422);
				gTermStar();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynthInvCmdContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public NTDefPlusContext nTDefPlus() {
			return getRuleContext(NTDefPlusContext.class,0);
		}
		public SynthInvCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthInvCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterSynthInvCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitSynthInvCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitSynthInvCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthInvCmdContext synthInvCmd() throws RecognitionException {
		SynthInvCmdContext _localctx = new SynthInvCmdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_synthInvCmd);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(T__0);
				setState(428);
				match(T__25);
				setState(429);
				symbol();
				setState(430);
				argList();
				setState(431);
				match(T__0);
				setState(432);
				nTDefPlus();
				setState(433);
				match(T__2);
				setState(434);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(T__0);
				setState(437);
				match(T__25);
				setState(438);
				symbol();
				setState(439);
				argList();
				setState(440);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarePrimedVarContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public DeclarePrimedVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarePrimedVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterDeclarePrimedVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitDeclarePrimedVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitDeclarePrimedVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarePrimedVarContext declarePrimedVar() throws RecognitionException {
		DeclarePrimedVarContext _localctx = new DeclarePrimedVarContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarePrimedVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__0);
			setState(445);
			match(T__26);
			setState(446);
			symbol();
			setState(447);
			sortExpr();
			setState(448);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvConstraintCmdContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public InvConstraintCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invConstraintCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterInvConstraintCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitInvConstraintCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitInvConstraintCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvConstraintCmdContext invConstraintCmd() throws RecognitionException {
		InvConstraintCmdContext _localctx = new InvConstraintCmdContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_invConstraintCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__0);
			setState(451);
			match(T__27);
			setState(452);
			symbol();
			setState(453);
			symbol();
			setState(454);
			symbol();
			setState(455);
			symbol();
			setState(456);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CliaGrammarCmdContext extends ParserRuleContext {
		public CliaGrammarCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cliaGrammarCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).enterCliaGrammarCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SygusListener ) ((SygusListener)listener).exitCliaGrammarCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SygusVisitor ) return ((SygusVisitor<? extends T>)visitor).visitCliaGrammarCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CliaGrammarCmdContext cliaGrammarCmd() throws RecognitionException {
		CliaGrammarCmdContext _localctx = new CliaGrammarCmdContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cliaGrammarCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__0);
			setState(459);
			match(T__28);
			setState(460);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u01d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\5\2q\n\2\3\3\3\3\3\3\3\3\5\3"+
		"w\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0087"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00b7\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00d0"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\5\27\u00e2\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\5\33\u00fe\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\5\35\u0108\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0117\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\5\"\u0128\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\5$\u0134\n$\3%"+
		"\3%\3%\3%\3%\5%\u013b\n%\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0144\n\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\5*\u0155\n*\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0171"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u018f\n.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\5\61\u01a0\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\5\63\u01ac\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01bd\n\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\3\3\2\16\17\2\u01c8\2p\3\2\2\2\4v\3\2\2"+
		"\2\6x\3\2\2\2\bz\3\2\2\2\n\177\3\2\2\2\f\u0086\3\2\2\2\16\u0094\3\2\2"+
		"\2\20\u0096\3\2\2\2\22\u009c\3\2\2\2\24\u00b6\3\2\2\2\26\u00b8\3\2\2\2"+
		"\30\u00ba\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2\2\2\36\u00c2\3\2\2\2 "+
		"\u00c4\3\2\2\2\"\u00c8\3\2\2\2$\u00cf\3\2\2\2&\u00d1\3\2\2\2(\u00d6\3"+
		"\2\2\2*\u00da\3\2\2\2,\u00e1\3\2\2\2.\u00e3\3\2\2\2\60\u00e8\3\2\2\2\62"+
		"\u00f0\3\2\2\2\64\u00fd\3\2\2\2\66\u00ff\3\2\2\28\u0107\3\2\2\2:\u0109"+
		"\3\2\2\2<\u0116\3\2\2\2>\u0118\3\2\2\2@\u0120\3\2\2\2B\u0127\3\2\2\2D"+
		"\u0129\3\2\2\2F\u0133\3\2\2\2H\u013a\3\2\2\2J\u013c\3\2\2\2L\u0143\3\2"+
		"\2\2N\u0145\3\2\2\2P\u014d\3\2\2\2R\u0154\3\2\2\2T\u0156\3\2\2\2V\u015a"+
		"\3\2\2\2X\u0170\3\2\2\2Z\u018e\3\2\2\2\\\u0190\3\2\2\2^\u0198\3\2\2\2"+
		"`\u019f\3\2\2\2b\u01a1\3\2\2\2d\u01ab\3\2\2\2f\u01bc\3\2\2\2h\u01be\3"+
		"\2\2\2j\u01c4\3\2\2\2l\u01cc\3\2\2\2nq\5\4\3\2oq\3\2\2\2pn\3\2\2\2po\3"+
		"\2\2\2q\3\3\2\2\2rs\5\b\5\2st\5\n\6\2tw\3\2\2\2uw\5\n\6\2vr\3\2\2\2vu"+
		"\3\2\2\2w\5\3\2\2\2xy\7&\2\2y\7\3\2\2\2z{\7\3\2\2{|\7\4\2\2|}\5\6\4\2"+
		"}~\7\5\2\2~\t\3\2\2\2\177\u0080\5\16\b\2\u0080\u0081\5\f\7\2\u0081\13"+
		"\3\2\2\2\u0082\u0083\5\16\b\2\u0083\u0084\5\f\7\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0085\3\2\2\2\u0087\r\3"+
		"\2\2\2\u0088\u0095\5\60\31\2\u0089\u0095\5\62\32\2\u008a\u0095\5X-\2\u008b"+
		"\u0095\5T+\2\u008c\u0095\5V,\2\u008d\u0095\5\22\n\2\u008e\u0095\5&\24"+
		"\2\u008f\u0095\5\20\t\2\u0090\u0095\5f\64\2\u0091\u0095\5h\65\2\u0092"+
		"\u0095\5j\66\2\u0093\u0095\5l\67\2\u0094\u0088\3\2\2\2\u0094\u0089\3\2"+
		"\2\2\u0094\u008a\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094"+
		"\u008d\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2"+
		"\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\17\3\2\2\2\u0096\u0097\7\3\2\2\u0097\u0098\7\6\2\2\u0098\u0099\5\6\4"+
		"\2\u0099\u009a\5\24\13\2\u009a\u009b\7\5\2\2\u009b\21\3\2\2\2\u009c\u009d"+
		"\7\3\2\2\u009d\u009e\7\7\2\2\u009e\u009f\5\6\4\2\u009f\u00a0\5\24\13\2"+
		"\u00a0\u00a1\7\5\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4"+
		"\7\b\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\7\5\2\2\u00a6\u00b7\3\2\2\2"+
		"\u00a7\u00b7\7\t\2\2\u00a8\u00b7\7\n\2\2\u00a9\u00b7\7\13\2\2\u00aa\u00ab"+
		"\7\3\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7\5\2\2\u00ae"+
		"\u00b7\3\2\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\5\24"+
		"\13\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4\7\5\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b7\5\6\4\2\u00b6\u00a2\3\2\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00a8\3\2"+
		"\2\2\u00b6\u00a9\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\7\"\2\2\u00b9\27\3\2\2\2\u00ba"+
		"\u00bb\t\2\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\33\3\2\2\2\u00be"+
		"\u00bf\5\6\4\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\5\6\4\2\u00c1\35\3\2\2"+
		"\2\u00c2\u00c3\7$\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6"+
		"\5\"\22\2\u00c6\u00c7\7\5\2\2\u00c7!\3\2\2\2\u00c8\u00c9\5\6\4\2\u00c9"+
		"\u00ca\5$\23\2\u00ca#\3\2\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\5$\23\2"+
		"\u00cd\u00d0\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\7\21\2\2\u00d3"+
		"\u00d4\5(\25\2\u00d4\u00d5\7\5\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\7\3\2\2"+
		"\u00d7\u00d8\5*\26\2\u00d8\u00d9\7\5\2\2\u00d9)\3\2\2\2\u00da\u00db\5"+
		".\30\2\u00db\u00dc\5,\27\2\u00dc+\3\2\2\2\u00dd\u00de\5.\30\2\u00de\u00df"+
		"\5,\27\2\u00df\u00e2\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2-\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5\5\6\4\2"+
		"\u00e5\u00e6\7%\2\2\u00e6\u00e7\7\5\2\2\u00e7/\3\2\2\2\u00e8\u00e9\7\3"+
		"\2\2\u00e9\u00ea\7\22\2\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec\5\66\34\2\u00ec"+
		"\u00ed\5\24\13\2\u00ed\u00ee\5<\37\2\u00ee\u00ef\7\5\2\2\u00ef\61\3\2"+
		"\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\7\23\2\2\u00f2\u00f3\5\6\4\2\u00f3"+
		"\u00f4\7\3\2\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\5"+
		"\24\13\2\u00f7\u00f8\7\5\2\2\u00f8\63\3\2\2\2\u00f9\u00fa\5\24\13\2\u00fa"+
		"\u00fb\5\64\33\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3"+
		"\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\65\3\2\2\2\u00ff\u0100\7\3\2\2\u0100"+
		"\u0101\58\35\2\u0101\u0102\7\5\2\2\u0102\67\3\2\2\2\u0103\u0104\5:\36"+
		"\2\u0104\u0105\58\35\2\u0105\u0108\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0103"+
		"\3\2\2\2\u0107\u0106\3\2\2\2\u01089\3\2\2\2\u0109\u010a\7\3\2\2\u010a"+
		"\u010b\5\6\4\2\u010b\u010c\5\24\13\2\u010c\u010d\7\5\2\2\u010d;\3\2\2"+
		"\2\u010e\u010f\7\3\2\2\u010f\u0110\5\6\4\2\u0110\u0111\5F$\2\u0111\u0112"+
		"\7\5\2\2\u0112\u0117\3\2\2\2\u0113\u0117\5H%\2\u0114\u0117\5\6\4\2\u0115"+
		"\u0117\5> \2\u0116\u010e\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0116\u0115\3\2\2\2\u0117=\3\2\2\2\u0118\u0119\7\3\2\2\u0119\u011a"+
		"\7\24\2\2\u011a\u011b\7\3\2\2\u011b\u011c\5@!\2\u011c\u011d\7\5\2\2\u011d"+
		"\u011e\5<\37\2\u011e\u011f\7\5\2\2\u011f?\3\2\2\2\u0120\u0121\5D#\2\u0121"+
		"\u0122\5B\"\2\u0122A\3\2\2\2\u0123\u0124\5D#\2\u0124\u0125\5B\"\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128C\3\2\2\2\u0129\u012a\7\3\2\2\u012a\u012b\5\6\4\2\u012b\u012c"+
		"\5\24\13\2\u012c\u012d\5<\37\2\u012d\u012e\7\5\2\2\u012eE\3\2\2\2\u012f"+
		"\u0130\5<\37\2\u0130\u0131\5F$\2\u0131\u0134\3\2\2\2\u0132\u0134\3\2\2"+
		"\2\u0133\u012f\3\2\2\2\u0133\u0132\3\2\2\2\u0134G\3\2\2\2\u0135\u013b"+
		"\5\26\f\2\u0136\u013b\5\30\r\2\u0137\u013b\5\32\16\2\u0138\u013b\5\34"+
		"\17\2\u0139\u013b\5\36\20\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013bI\3\2\2\2"+
		"\u013c\u013d\5N(\2\u013d\u013e\5L\'\2\u013eK\3\2\2\2\u013f\u0140\5N(\2"+
		"\u0140\u0141\5L\'\2\u0141\u0144\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u013f"+
		"\3\2\2\2\u0143\u0142\3\2\2\2\u0144M\3\2\2\2\u0145\u0146\7\3\2\2\u0146"+
		"\u0147\5\6\4\2\u0147\u0148\5\24\13\2\u0148\u0149\7\3\2\2\u0149\u014a\5"+
		"P)\2\u014a\u014b\7\5\2\2\u014b\u014c\7\5\2\2\u014cO\3\2\2\2\u014d\u014e"+
		"\5Z.\2\u014e\u014f\5R*\2\u014fQ\3\2\2\2\u0150\u0151\5Z.\2\u0151\u0152"+
		"\5R*\2\u0152\u0155\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0150\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155S\3\2\2\2\u0156\u0157\7\3\2\2\u0157\u0158\7\25\2\2"+
		"\u0158\u0159\7\5\2\2\u0159U\3\2\2\2\u015a\u015b\7\3\2\2\u015b\u015c\7"+
		"\26\2\2\u015c\u015d\5<\37\2\u015d\u015e\7\5\2\2\u015eW\3\2\2\2\u015f\u0160"+
		"\7\3\2\2\u0160\u0161\7\27\2\2\u0161\u0162\5\6\4\2\u0162\u0163\5\66\34"+
		"\2\u0163\u0164\5\24\13\2\u0164\u0165\7\3\2\2\u0165\u0166\5J&\2\u0166\u0167"+
		"\7\5\2\2\u0167\u0168\7\5\2\2\u0168\u0171\3\2\2\2\u0169\u016a\7\3\2\2\u016a"+
		"\u016b\7\27\2\2\u016b\u016c\5\6\4\2\u016c\u016d\5\66\34\2\u016d\u016e"+
		"\5\24\13\2\u016e\u016f\7\5\2\2\u016f\u0171\3\2\2\2\u0170\u015f\3\2\2\2"+
		"\u0170\u0169\3\2\2\2\u0171Y\3\2\2\2\u0172\u018f\5\6\4\2\u0173\u018f\5"+
		"H%\2\u0174\u0175\7\3\2\2\u0175\u0176\5\6\4\2\u0176\u0177\5d\63\2\u0177"+
		"\u0178\7\5\2\2\u0178\u018f\3\2\2\2\u0179\u017a\7\3\2\2\u017a\u017b\7\30"+
		"\2\2\u017b\u017c\5\24\13\2\u017c\u017d\7\5\2\2\u017d\u018f\3\2\2\2\u017e"+
		"\u017f\7\3\2\2\u017f\u0180\7\31\2\2\u0180\u0181\5\24\13\2\u0181\u0182"+
		"\7\5\2\2\u0182\u018f\3\2\2\2\u0183\u0184\7\3\2\2\u0184\u0185\7\32\2\2"+
		"\u0185\u0186\5\24\13\2\u0186\u0187\7\5\2\2\u0187\u018f\3\2\2\2\u0188\u0189"+
		"\7\3\2\2\u0189\u018a\7\33\2\2\u018a\u018b\5\24\13\2\u018b\u018c\7\5\2"+
		"\2\u018c\u018f\3\2\2\2\u018d\u018f\5\\/\2\u018e\u0172\3\2\2\2\u018e\u0173"+
		"\3\2\2\2\u018e\u0174\3\2\2\2\u018e\u0179\3\2\2\2\u018e\u017e\3\2\2\2\u018e"+
		"\u0183\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u018d\3\2\2\2\u018f[\3\2\2\2"+
		"\u0190\u0191\7\3\2\2\u0191\u0192\7\24\2\2\u0192\u0193\7\3\2\2\u0193\u0194"+
		"\5^\60\2\u0194\u0195\7\5\2\2\u0195\u0196\5Z.\2\u0196\u0197\7\5\2\2\u0197"+
		"]\3\2\2\2\u0198\u0199\5b\62\2\u0199\u019a\5`\61\2\u019a_\3\2\2\2\u019b"+
		"\u019c\5b\62\2\u019c\u019d\5`\61\2\u019d\u01a0\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u019b\3\2\2\2\u019f\u019e\3\2\2\2\u01a0a\3\2\2\2\u01a1\u01a2"+
		"\7\3\2\2\u01a2\u01a3\5\6\4\2\u01a3\u01a4\5\24\13\2\u01a4\u01a5\5Z.\2\u01a5"+
		"\u01a6\7\5\2\2\u01a6c\3\2\2\2\u01a7\u01a8\5Z.\2\u01a8\u01a9\5d\63\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01aa\3\2"+
		"\2\2\u01ace\3\2\2\2\u01ad\u01ae\7\3\2\2\u01ae\u01af\7\34\2\2\u01af\u01b0"+
		"\5\6\4\2\u01b0\u01b1\5\66\34\2\u01b1\u01b2\7\3\2\2\u01b2\u01b3\5J&\2\u01b3"+
		"\u01b4\7\5\2\2\u01b4\u01b5\7\5\2\2\u01b5\u01bd\3\2\2\2\u01b6\u01b7\7\3"+
		"\2\2\u01b7\u01b8\7\34\2\2\u01b8\u01b9\5\6\4\2\u01b9\u01ba\5\66\34\2\u01ba"+
		"\u01bb\7\5\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ad\3\2\2\2\u01bc\u01b6\3\2"+
		"\2\2\u01bdg\3\2\2\2\u01be\u01bf\7\3\2\2\u01bf\u01c0\7\35\2\2\u01c0\u01c1"+
		"\5\6\4\2\u01c1\u01c2\5\24\13\2\u01c2\u01c3\7\5\2\2\u01c3i\3\2\2\2\u01c4"+
		"\u01c5\7\3\2\2\u01c5\u01c6\7\36\2\2\u01c6\u01c7\5\6\4\2\u01c7\u01c8\5"+
		"\6\4\2\u01c8\u01c9\5\6\4\2\u01c9\u01ca\5\6\4\2\u01ca\u01cb\7\5\2\2\u01cb"+
		"k\3\2\2\2\u01cc\u01cd\7\3\2\2\u01cd\u01ce\7\37\2\2\u01ce\u01cf\7\5\2\2"+
		"\u01cfm\3\2\2\2\26pv\u0086\u0094\u00b6\u00cf\u00e1\u00fd\u0107\u0116\u0127"+
		"\u0133\u013a\u0143\u0154\u0170\u018e\u019f\u01ab\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}