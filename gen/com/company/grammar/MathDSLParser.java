// Generated from /Users/joudnassar/Developer/HSBI/DSL-IR-Project/src/com/company/grammar/MathDSL.g4 by ANTLR 4.13.2
package com.company.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MathDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, LET=2, UNIT_TIME=3, UNIT_LENGTH=4, UNIT_MASS=5, NUMBER=6, ID=7, 
		LPAREN=8, RPAREN=9, COMMA=10, COLON=11, EQUAL=12, PLUS=13, MINUS=14, MULTI=15, 
		DIV=16, FACT=17, POWER=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_funDecl = 2, RULE_letDecl = 3, 
		RULE_exprStmt = 4, RULE_paramList = 5, RULE_param = 6, RULE_argList = 7, 
		RULE_unit = 8, RULE_baseUnit = 9, RULE_expr = 10, RULE_term = 11, RULE_factor = 12, 
		RULE_postfix = 13, RULE_primary = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "funDecl", "letDecl", "exprStmt", "paramList", "param", 
			"argList", "UnitNode", "baseUnit", "expr", "term", "factor", "postfix", "primary"
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

	@Override
	public String getGrammarFileName() { return "MathDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MathDSLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 454L) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public LetDeclContext letDecl() {
			return getRuleContext(LetDeclContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				funDecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				letDecl();
				}
				break;
			case NUMBER:
			case ID:
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				exprStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclContext extends ParserRuleContext {
		public Token fname;
		public TerminalNode FUN() { return getToken(MathDSLParser.FUN, 0); }
		public TerminalNode LPAREN() { return getToken(MathDSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MathDSLParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(MathDSLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MathDSLParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MathDSLParser.COLON, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitFunDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(FUN);
			setState(44);
			((FunDeclContext)_localctx).fname = match(ID);
			setState(45);
			match(LPAREN);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(46);
				paramList();
				}
			}

			setState(49);
			match(RPAREN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(50);
				match(COLON);
				setState(51);
				unit();
				}
			}

			setState(54);
			match(EQUAL);
			setState(55);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetDeclContext extends ParserRuleContext {
		public Token vname;
		public TerminalNode LET() { return getToken(MathDSLParser.LET, 0); }
		public TerminalNode EQUAL() { return getToken(MathDSLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MathDSLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MathDSLParser.COLON, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterLetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitLetDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitLetDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LET);
			setState(58);
			((LetDeclContext)_localctx).vname = match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(59);
				match(COLON);
				setState(60);
				unit();
				}
			}

			setState(63);
			match(EQUAL);
			setState(64);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathDSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathDSLParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			param();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				param();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public Token pname;
		public TerminalNode COLON() { return getToken(MathDSLParser.COLON, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public TerminalNode ID() { return getToken(MathDSLParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((ParamContext)_localctx).pname = match(ID);
			setState(77);
			match(COLON);
			setState(78);
			unit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathDSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathDSLParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			expr(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				expr(0);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public List<BaseUnitContext> baseUnit() {
			return getRuleContexts(BaseUnitContext.class);
		}
		public BaseUnitContext baseUnit(int i) {
			return getRuleContext(BaseUnitContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MathDSLParser.DIV, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unit);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				baseUnit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				baseUnit();
				setState(90);
				match(DIV);
				setState(91);
				baseUnit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BaseUnitContext extends ParserRuleContext {
		public TerminalNode UNIT_TIME() { return getToken(MathDSLParser.UNIT_TIME, 0); }
		public TerminalNode UNIT_LENGTH() { return getToken(MathDSLParser.UNIT_LENGTH, 0); }
		public TerminalNode UNIT_MASS() { return getToken(MathDSLParser.UNIT_MASS, 0); }
		public BaseUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterBaseUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitBaseUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitBaseUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseUnitContext baseUnit() throws RecognitionException {
		BaseUnitContext _localctx = new BaseUnitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_baseUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MathDSLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MathDSLParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						match(PLUS);
						setState(102);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104);
						match(MINUS);
						setState(105);
						term(0);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULTI() { return getToken(MathDSLParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(MathDSLParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(115);
						match(MULTI);
						setState(116);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(DIV);
						setState(119);
						factor();
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode POWER() { return getToken(MathDSLParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				postfix();
				setState(126);
				match(POWER);
				setState(127);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				postfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode FACT() { return getToken(MathDSLParser.FACT, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_postfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			primary();
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(133);
				match(FACT);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MathDSLParser.NUMBER, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public TerminalNode ID() { return getToken(MathDSLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MathDSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MathDSLParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathDSLListener ) ((MathDSLListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathDSLVisitor ) return ((MathDSLVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(NUMBER);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(137);
					unit();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ID);
				setState(141);
				match(LPAREN);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
					{
					setState(142);
					argList();
					}
				}

				setState(145);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(LPAREN);
				setState(148);
				expr(0);
				setState(149);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005"+
		"\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005H\b\u0005\n\u0005\f\u0005K\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\nk\b\n\n\n\f\nn\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000by\b"+
		"\u000b\n\u000b\f\u000b|\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0083\b\f\u0001\r\u0001\r\u0003\r\u0087\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u008b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0090\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0098\b\u000e\u0001\u000e\u0000\u0002\u0014"+
		"\u0016\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u0003\u0005\u009e\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000"+
		"\u0000\u00069\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nD\u0001"+
		"\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000"+
		"\u0000\u0010]\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014"+
		"a\u0001\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018\u0082\u0001"+
		"\u0000\u0000\u0000\u001a\u0084\u0001\u0000\u0000\u0000\u001c\u0097\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&*\u0003"+
		"\u0004\u0002\u0000\'*\u0003\u0006\u0003\u0000(*\u0003\b\u0004\u0000)&"+
		"\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005"+
		"\u0007\u0000\u0000-/\u0005\b\u0000\u0000.0\u0003\n\u0005\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"14\u0005\t\u0000\u000023\u0005\u000b\u0000\u000035\u0003\u0010\b\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0005\f\u0000\u000078\u0003\u0014\n\u00008\u0005\u0001\u0000"+
		"\u0000\u00009:\u0005\u0002\u0000\u0000:=\u0005\u0007\u0000\u0000;<\u0005"+
		"\u000b\u0000\u0000<>\u0003\u0010\b\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\f\u0000\u0000@A\u0003"+
		"\u0014\n\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0003\u0014\n\u0000C\t"+
		"\u0001\u0000\u0000\u0000DI\u0003\f\u0006\u0000EF\u0005\n\u0000\u0000F"+
		"H\u0003\f\u0006\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u000b\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0005"+
		"\u000b\u0000\u0000NO\u0003\u0010\b\u0000O\r\u0001\u0000\u0000\u0000PU"+
		"\u0003\u0014\n\u0000QR\u0005\n\u0000\u0000RT\u0003\u0014\n\u0000SQ\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u000f\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000X^\u0003\u0012\t\u0000YZ\u0003\u0012\t\u0000Z[\u0005\u0010"+
		"\u0000\u0000[\\\u0003\u0012\t\u0000\\^\u0001\u0000\u0000\u0000]X\u0001"+
		"\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000^\u0011\u0001\u0000\u0000"+
		"\u0000_`\u0007\u0000\u0000\u0000`\u0013\u0001\u0000\u0000\u0000ab\u0006"+
		"\n\uffff\uffff\u0000bc\u0003\u0016\u000b\u0000cl\u0001\u0000\u0000\u0000"+
		"de\n\u0003\u0000\u0000ef\u0005\r\u0000\u0000fk\u0003\u0016\u000b\u0000"+
		"gh\n\u0002\u0000\u0000hi\u0005\u000e\u0000\u0000ik\u0003\u0016\u000b\u0000"+
		"jd\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0015\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0006\u000b\uffff\uffff"+
		"\u0000pq\u0003\u0018\f\u0000qz\u0001\u0000\u0000\u0000rs\n\u0003\u0000"+
		"\u0000st\u0005\u000f\u0000\u0000ty\u0003\u0018\f\u0000uv\n\u0002\u0000"+
		"\u0000vw\u0005\u0010\u0000\u0000wy\u0003\u0018\f\u0000xr\u0001\u0000\u0000"+
		"\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0017\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}~\u0003\u001a\r\u0000~\u007f\u0005\u0012\u0000"+
		"\u0000\u007f\u0080\u0003\u0018\f\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0003\u001a\r\u0000\u0082}\u0001\u0000\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0019\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0003\u001c\u000e\u0000\u0085\u0087\u0005\u0011\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u001b\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0006\u0000\u0000\u0089"+
		"\u008b\u0003\u0010\b\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u0098\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0007\u0000\u0000\u008d\u008f\u0005\b\u0000\u0000\u008e\u0090\u0003"+
		"\u000e\u0007\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0098\u0005"+
		"\t\u0000\u0000\u0092\u0098\u0005\u0007\u0000\u0000\u0093\u0094\u0005\b"+
		"\u0000\u0000\u0094\u0095\u0003\u0014\n\u0000\u0095\u0096\u0005\t\u0000"+
		"\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0088\u0001\u0000\u0000"+
		"\u0000\u0097\u008c\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000"+
		"\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0098\u001d\u0001\u0000\u0000"+
		"\u0000\u0011!)/4=IU]jlxz\u0082\u0086\u008a\u008f\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}