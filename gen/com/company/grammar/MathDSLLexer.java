// Generated from /Users/joudnassar/Developer/HSBI/DSL-IR-Project/src/com/company/grammar/MathDSL.g4 by ANTLR 4.13.2
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
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, LET=2, UNIT_TIME=3, UNIT_LENGTH=4, UNIT_MASS=5, NUMBER=6, ID=7, 
		LPAREN=8, RPAREN=9, COMMA=10, COLON=11, EQUAL=12, PLUS=13, MINUS=14, MULTI=15, 
		DIV=16, FACT=17, POWER=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUN", "LET", "UNIT_TIME", "UNIT_LENGTH", "UNIT_MASS", "NUMBER", "ID", 
			"LPAREN", "RPAREN", "COMMA", "COLON", "EQUAL", "PLUS", "MINUS", "MULTI", 
			"DIV", "FACT", "POWER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'let'", null, null, null, null, null, "'('", "')'", "','", 
			"':'", "'='", "'+'", "'-'", "'*'", "'/'", "'!'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN", "LET", "UNIT_TIME", "UNIT_LENGTH", "UNIT_MASS", "NUMBER", 
			"ID", "LPAREN", "RPAREN", "COMMA", "COLON", "EQUAL", "PLUS", "MINUS", 
			"MULTI", "DIV", "FACT", "POWER", "WS"
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
		"\u0004\u0000\u0013o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004?\b\u0004\u0001\u0005\u0004\u0005B\b\u0005\u000b\u0005"+
		"\f\u0005C\u0001\u0005\u0001\u0005\u0004\u0005H\b\u0005\u000b\u0005\f\u0005"+
		"I\u0003\u0005L\b\u0005\u0001\u0006\u0004\u0006O\b\u0006\u000b\u0006\f"+
		"\u0006P\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012j\b\u0012\u000b\u0012\f\u0012"+
		"k\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0004\u0002\u0000hhss\u0001\u000009\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00079"+
		"\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000bA\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000"+
		"\u0011T\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001"+
		"\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000\u0000"+
		"\u0000\u001fb\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#f\u0001"+
		"\u0000\u0000\u0000%i\u0001\u0000\u0000\u0000\'(\u0005f\u0000\u0000()\u0005"+
		"u\u0000\u0000)*\u0005n\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"l\u0000\u0000,-\u0005e\u0000\u0000-.\u0005t\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/0\u0005m\u0000\u000003\u0005s\u0000\u000013\u0007\u0000\u0000"+
		"\u00002/\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0006\u0001"+
		"\u0000\u0000\u000045\u0005c\u0000\u00005:\u0005m\u0000\u00006:\u0005m"+
		"\u0000\u000078\u0005k\u0000\u00008:\u0005m\u0000\u000094\u0001\u0000\u0000"+
		"\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:\b\u0001\u0000"+
		"\u0000\u0000;?\u0005g\u0000\u0000<=\u0005k\u0000\u0000=?\u0005g\u0000"+
		"\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?\n\u0001\u0000"+
		"\u0000\u0000@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DK\u0001\u0000\u0000\u0000EG\u0005.\u0000\u0000FH\u0007\u0001\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KE\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000L\f\u0001\u0000\u0000\u0000MO\u0007"+
		"\u0002\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u000e\u0001\u0000"+
		"\u0000\u0000RS\u0005(\u0000\u0000S\u0010\u0001\u0000\u0000\u0000TU\u0005"+
		")\u0000\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0005,\u0000\u0000W\u0014"+
		"\u0001\u0000\u0000\u0000XY\u0005:\u0000\u0000Y\u0016\u0001\u0000\u0000"+
		"\u0000Z[\u0005=\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0005+\u0000"+
		"\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005-\u0000\u0000_\u001c\u0001"+
		"\u0000\u0000\u0000`a\u0005*\u0000\u0000a\u001e\u0001\u0000\u0000\u0000"+
		"bc\u0005/\u0000\u0000c \u0001\u0000\u0000\u0000de\u0005!\u0000\u0000e"+
		"\"\u0001\u0000\u0000\u0000fg\u0005^\u0000\u0000g$\u0001\u0000\u0000\u0000"+
		"hj\u0007\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0006\u0012\u0000\u0000n&\u0001\u0000\u0000\u0000\t\u0000"+
		"29>CIKPk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}