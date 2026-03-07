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
		FUN=1, LET=2, NUMBER=3, ID=4, LPAREN=5, RPAREN=6, COMMA=7, COLON=8, EQUAL=9, 
		PLUS=10, MINUS=11, MULTI=12, DIV=13, FACT=14, POWER=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUN", "LET", "NUMBER", "ID", "LPAREN", "RPAREN", "COMMA", "COLON", "EQUAL", 
			"PLUS", "MINUS", "MULTI", "DIV", "FACT", "POWER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'let'", null, null, "'('", "')'", "','", "':'", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'!'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN", "LET", "NUMBER", "ID", "LPAREN", "RPAREN", "COMMA", "COLON", 
			"EQUAL", "PLUS", "MINUS", "MULTI", "DIV", "FACT", "POWER", "WS"
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
		"\u0004\u0000\u0010X\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002+\b"+
		"\u0002\u000b\u0002\f\u0002,\u0001\u0002\u0001\u0002\u0004\u00021\b\u0002"+
		"\u000b\u0002\f\u00022\u0003\u00025\b\u0002\u0001\u0003\u0004\u00038\b"+
		"\u0003\u000b\u0003\f\u00039\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fS\b"+
		"\u000f\u000b\u000f\f\u000fT\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0003\u0001\u000009\u0002\u0000A"+
		"Zaz\u0003\u0000\t\n\r\r  \\\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000"+
		"\u0000\u0005*\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t"+
		";\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001\u0000"+
		"\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000"+
		"\u0013E\u0001\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I"+
		"\u0001\u0000\u0000\u0000\u0019K\u0001\u0000\u0000\u0000\u001bM\u0001\u0000"+
		"\u0000\u0000\u001dO\u0001\u0000\u0000\u0000\u001fR\u0001\u0000\u0000\u0000"+
		"!\"\u0005f\u0000\u0000\"#\u0005u\u0000\u0000#$\u0005n\u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%&\u0005l\u0000\u0000&\'\u0005e\u0000\u0000\'"+
		"(\u0005t\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)+\u0007\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-4\u0001\u0000\u0000\u0000.0\u0005"+
		".\u0000\u0000/1\u0007\u0000\u0000\u00000/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"35\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u00005\u0006\u0001\u0000\u0000\u000068\u0007\u0001\u0000\u000076\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000"+
		"<\n\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\f\u0001\u0000\u0000"+
		"\u0000?@\u0005,\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005:\u0000"+
		"\u0000B\u0010\u0001\u0000\u0000\u0000CD\u0005=\u0000\u0000D\u0012\u0001"+
		"\u0000\u0000\u0000EF\u0005+\u0000\u0000F\u0014\u0001\u0000\u0000\u0000"+
		"GH\u0005-\u0000\u0000H\u0016\u0001\u0000\u0000\u0000IJ\u0005*\u0000\u0000"+
		"J\u0018\u0001\u0000\u0000\u0000KL\u0005/\u0000\u0000L\u001a\u0001\u0000"+
		"\u0000\u0000MN\u0005!\u0000\u0000N\u001c\u0001\u0000\u0000\u0000OP\u0005"+
		"^\u0000\u0000P\u001e\u0001\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u000f"+
		"\u0000\u0000W \u0001\u0000\u0000\u0000\u0006\u0000,249T\u0001\u0006\u0000"+
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