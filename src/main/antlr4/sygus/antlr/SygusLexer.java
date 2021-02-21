// Generated from /home/t-keita/development/sygus/sygus-kotlin/src/main/antlr4/Sygus.g4 by ANTLR 4.9.1
package sygus.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SygusLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "WS", "COMMENT", "INTEGER", "BVCONST", 
			"REALCONST", "QUOTEDLIT", "SYMBOL"
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


	public SygusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sygus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u019c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\6\37\u0150\n\37\r\37\16\37\u0151\3\37\3\37\3 \3 \7 \u0158\n \f \16 \u015b"+
		"\13 \3 \3 \3 \3 \3!\5!\u0162\n!\3!\6!\u0165\n!\r!\16!\u0166\3\"\3\"\3"+
		"\"\3\"\6\"\u016d\n\"\r\"\16\"\u016e\3\"\3\"\3\"\3\"\6\"\u0175\n\"\r\""+
		"\16\"\u0176\5\"\u0179\n\"\3#\5#\u017c\n#\3#\6#\u017f\n#\r#\16#\u0180\3"+
		"#\3#\6#\u0185\n#\r#\16#\u0186\3$\3$\6$\u018b\n$\r$\16$\u018c\3$\3$\3%"+
		"\5%\u0192\n%\3%\5%\u0195\n%\3%\7%\u0198\n%\f%\16%\u019b\13%\2\2&\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&\3\2\b\5\2\13\f\16\16\"\"\3\2\f\f\3\2\62;\5\2\62;CHch\6\2\60"+
		"\60\62;C\\c|\f\2##&(,-/\61>AC\\`ac|~~\u0080\u0080\2\u01a8\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\3K\3\2\2\2\5M\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13e\3\2\2\2\rq\3\2\2\2\17"+
		"x\3\2\2\2\21|\3\2\2\2\23\u0081\3\2\2\2\25\u0086\3\2\2\2\27\u008b\3\2\2"+
		"\2\31\u0091\3\2\2\2\33\u0096\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3\2\2\2"+
		"!\u00ab\3\2\2\2#\u00b6\3\2\2\2%\u00c2\3\2\2\2\'\u00c6\3\2\2\2)\u00d2\3"+
		"\2\2\2+\u00dd\3\2\2\2-\u00e7\3\2\2\2/\u00f0\3\2\2\2\61\u00f9\3\2\2\2\63"+
		"\u0107\3\2\2\2\65\u0115\3\2\2\2\67\u011f\3\2\2\29\u0132\3\2\2\2;\u0141"+
		"\3\2\2\2=\u014f\3\2\2\2?\u0155\3\2\2\2A\u0161\3\2\2\2C\u0178\3\2\2\2E"+
		"\u017b\3\2\2\2G\u0188\3\2\2\2I\u0191\3\2\2\2KL\7*\2\2L\4\3\2\2\2MN\7u"+
		"\2\2NO\7g\2\2OP\7v\2\2PQ\7/\2\2QR\7n\2\2RS\7q\2\2ST\7i\2\2TU\7k\2\2UV"+
		"\7e\2\2V\6\3\2\2\2WX\7+\2\2X\b\3\2\2\2YZ\7f\2\2Z[\7g\2\2[\\\7e\2\2\\]"+
		"\7n\2\2]^\7c\2\2^_\7t\2\2_`\7g\2\2`a\7/\2\2ab\7x\2\2bc\7c\2\2cd\7t\2\2"+
		"d\n\3\2\2\2ef\7f\2\2fg\7g\2\2gh\7h\2\2hi\7k\2\2ij\7p\2\2jk\7g\2\2kl\7"+
		"/\2\2lm\7u\2\2mn\7q\2\2no\7t\2\2op\7v\2\2p\f\3\2\2\2qr\7D\2\2rs\7k\2\2"+
		"st\7v\2\2tu\7X\2\2uv\7g\2\2vw\7e\2\2w\16\3\2\2\2xy\7K\2\2yz\7p\2\2z{\7"+
		"v\2\2{\20\3\2\2\2|}\7D\2\2}~\7q\2\2~\177\7q\2\2\177\u0080\7n\2\2\u0080"+
		"\22\3\2\2\2\u0081\u0082\7T\2\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7n\2\2\u0085\24\3\2\2\2\u0086\u0087\7G\2\2\u0087\u0088\7p\2\2\u0088"+
		"\u0089\7w\2\2\u0089\u008a\7o\2\2\u008a\26\3\2\2\2\u008b\u008c\7C\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\u0090\7{\2\2"+
		"\u0090\30\3\2\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7"+
		"w\2\2\u0094\u0095\7g\2\2\u0095\32\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b"+
		"\34\3\2\2\2\u009c\u009d\7<\2\2\u009d\u009e\7<\2\2\u009e\36\3\2\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7/\2\2"+
		"\u00a3\u00a4\7q\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\7k\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		" \3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7/\2\2"+
		"\u00b2\u00b3\7h\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7p\2\2\u00b5\"\3\2"+
		"\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba"+
		"\7n\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7/\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1$\3\2\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2"+
		"\2\u00c5&\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7"+
		"g\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7m\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\u00ce\7{\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7j\2\2\u00d1(\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8\u00d9\7c\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc*\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7{\2\2\u00df\u00e0"+
		"\7p\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7/\2\2\u00e3"+
		"\u00e4\7h\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7p\2\2\u00e6,\3\2\2\2\u00e7"+
		"\u00e8\7E\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7u\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7X\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7d\2\2\u00f6"+
		"\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7K\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7v\2\2"+
		"\u00fe\u00ff\7X\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7t\2\2\u0101\u0102"+
		"\7k\2\2\u0102\u0103\7c\2\2\u0103\u0104\7d\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7g\2\2\u0106\62\3\2\2\2\u0107\u0108\7N\2\2\u0108\u0109\7q\2\2\u0109"+
		"\u010a\7e\2\2\u010a\u010b\7c\2\2\u010b\u010c\7n\2\2\u010c\u010d\7X\2\2"+
		"\u010d\u010e\7c\2\2\u010e\u010f\7t\2\2\u010f\u0110\7k\2\2\u0110\u0111"+
		"\7c\2\2\u0111\u0112\7d\2\2\u0112\u0113\7n\2\2\u0113\u0114\7g\2\2\u0114"+
		"\64\3\2\2\2\u0115\u0116\7u\2\2\u0116\u0117\7{\2\2\u0117\u0118\7p\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7j\2\2\u011a\u011b\7/\2\2\u011b\u011c\7k\2\2"+
		"\u011c\u011d\7p\2\2\u011d\u011e\7x\2\2\u011e\66\3\2\2\2\u011f\u0120\7"+
		"f\2\2\u0120\u0121\7g\2\2\u0121\u0122\7e\2\2\u0122\u0123\7n\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0125\7t\2\2\u0125\u0126\7g\2\2\u0126\u0127\7/\2\2\u0127"+
		"\u0128\7r\2\2\u0128\u0129\7t\2\2\u0129\u012a\7k\2\2\u012a\u012b\7o\2\2"+
		"\u012b\u012c\7g\2\2\u012c\u012d\7f\2\2\u012d\u012e\7/\2\2\u012e\u012f"+
		"\7x\2\2\u012f\u0130\7c\2\2\u0130\u0131\7t\2\2\u01318\3\2\2\2\u0132\u0133"+
		"\7k\2\2\u0133\u0134\7p\2\2\u0134\u0135\7x\2\2\u0135\u0136\7/\2\2\u0136"+
		"\u0137\7e\2\2\u0137\u0138\7q\2\2\u0138\u0139\7p\2\2\u0139\u013a\7u\2\2"+
		"\u013a\u013b\7v\2\2\u013b\u013c\7t\2\2\u013c\u013d\7c\2\2\u013d\u013e"+
		"\7k\2\2\u013e\u013f\7p\2\2\u013f\u0140\7v\2\2\u0140:\3\2\2\2\u0141\u0142"+
		"\7e\2\2\u0142\u0143\7n\2\2\u0143\u0144\7k\2\2\u0144\u0145\7c\2\2\u0145"+
		"\u0146\7/\2\2\u0146\u0147\7i\2\2\u0147\u0148\7t\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u014a\7o\2\2\u014a\u014b\7o\2\2\u014b\u014c\7c\2\2\u014c\u014d"+
		"\7t\2\2\u014d<\3\2\2\2\u014e\u0150\t\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\b\37\2\2\u0154>\3\2\2\2\u0155\u0159\7=\2\2\u0156\u0158\n\3\2\2"+
		"\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\f\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\b \2\2\u015f@\3\2\2\2\u0160\u0162\7/\2\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\t\4"+
		"\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167B\3\2\2\2\u0168\u0169\7%\2\2\u0169\u016a\7z\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u016d\t\5\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0179\3\2\2\2\u0170"+
		"\u0171\7%\2\2\u0171\u0172\7d\2\2\u0172\u0174\3\2\2\2\u0173\u0175\4\62"+
		"\63\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0168\3\2\2\2\u0178\u0170\3\2"+
		"\2\2\u0179D\3\2\2\2\u017a\u017c\7/\2\2\u017b\u017a\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\t\4\2\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\7\60\2\2\u0183\u0185\t\4\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187F\3\2\2\2"+
		"\u0188\u018a\7$\2\2\u0189\u018b\t\6\2\2\u018a\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\7$\2\2\u018fH\3\2\2\2\u0190\u0192\t\7\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0199\3\2\2\2\u0193\u0195\t\7\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2"+
		"\2\2\u0196\u0198\t\4\2\2\u0197\u0194\3\2\2\2\u0197\u0196\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aJ\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\24\2\u0151\u0159\u0161\u0166\u016c\u016e\u0176\u0178"+
		"\u017b\u0180\u0186\u018a\u018c\u0191\u0194\u0197\u0199\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}