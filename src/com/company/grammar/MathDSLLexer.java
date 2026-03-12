// Generated from src/com/company/grammar/MathDSL.g4 by ANTLR 4.13.1
package com.company.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MathDSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, LET=2, IF=3, THEN=4, ELSE=5, NUMBER=6, ID=7, LPAREN=8, RPAREN=9, 
		COMMA=10, COLON=11, EQUAL=12, PLUS=13, MINUS=14, MULTI=15, DIV=16, FACT=17, 
		POWER=18, SEMI=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUN", "LET", "IF", "THEN", "ELSE", "NUMBER", "ID", "LPAREN", "RPAREN", 
			"COMMA", "COLON", "EQUAL", "PLUS", "MINUS", "MULTI", "DIV", "FACT", "POWER", 
			"SEMI", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'let'", "'if'", "'then'", "'else'", null, null, "'('", 
			"')'", "','", "':'", "'='", "'+'", "'-'", "'*'", "'/'", "'!'", "'^'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN", "LET", "IF", "THEN", "ELSE", "NUMBER", "ID", "LPAREN", "RPAREN", 
			"COMMA", "COLON", "EQUAL", "PLUS", "MINUS", "MULTI", "DIV", "FACT", "POWER", 
			"SEMI", "WS"
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


	public MathDSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathDSL.g4"; }

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
		"\u0004\u0000\u0014o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005@\b\u0005\u000b\u0005\f\u0005A\u0001\u0005"+
		"\u0001\u0005\u0004\u0005F\b\u0005\u000b\u0005\f\u0005G\u0003\u0005J\b"+
		"\u0005\u0001\u0006\u0004\u0006M\b\u0006\u000b\u0006\f\u0006N\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0004\u0013j\b\u0013\u000b\u0013\f\u0013"+
		"k\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014\u0001\u0000\u0003\u0001\u000009\u0002\u0000AZa"+
		"z\u0003\u0000\t\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001"+
		")\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t9\u0001\u0000\u0000"+
		"\u0000\u000b?\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000f"+
		"P\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013T\u0001"+
		"\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000"+
		"\u0000\u0019Z\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000"+
		"\u001d^\u0001\u0000\u0000\u0000\u001f`\u0001\u0000\u0000\u0000!b\u0001"+
		"\u0000\u0000\u0000#d\u0001\u0000\u0000\u0000%f\u0001\u0000\u0000\u0000"+
		"\'i\u0001\u0000\u0000\u0000)*\u0005f\u0000\u0000*+\u0005u\u0000\u0000"+
		"+,\u0005n\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005l\u0000\u0000"+
		"./\u0005e\u0000\u0000/0\u0005t\u0000\u00000\u0004\u0001\u0000\u0000\u0000"+
		"12\u0005i\u0000\u000023\u0005f\u0000\u00003\u0006\u0001\u0000\u0000\u0000"+
		"45\u0005t\u0000\u000056\u0005h\u0000\u000067\u0005e\u0000\u000078\u0005"+
		"n\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005e\u0000\u0000:;\u0005"+
		"l\u0000\u0000;<\u0005s\u0000\u0000<=\u0005e\u0000\u0000=\n\u0001\u0000"+
		"\u0000\u0000>@\u0007\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BI\u0001\u0000\u0000\u0000CE\u0005.\u0000\u0000DF\u0007\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IC\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\f\u0001\u0000\u0000\u0000KM\u0007"+
		"\u0001\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u000e\u0001\u0000"+
		"\u0000\u0000PQ\u0005(\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005"+
		")\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005,\u0000\u0000U\u0014"+
		"\u0001\u0000\u0000\u0000VW\u0005:\u0000\u0000W\u0016\u0001\u0000\u0000"+
		"\u0000XY\u0005=\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000Z[\u0005+\u0000"+
		"\u0000[\u001a\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]\u001c\u0001"+
		"\u0000\u0000\u0000^_\u0005*\u0000\u0000_\u001e\u0001\u0000\u0000\u0000"+
		"`a\u0005/\u0000\u0000a \u0001\u0000\u0000\u0000bc\u0005!\u0000\u0000c"+
		"\"\u0001\u0000\u0000\u0000de\u0005^\u0000\u0000e$\u0001\u0000\u0000\u0000"+
		"fg\u0005;\u0000\u0000g&\u0001\u0000\u0000\u0000hj\u0007\u0002\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0013"+
		"\u0000\u0000n(\u0001\u0000\u0000\u0000\u0006\u0000AGINk\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}