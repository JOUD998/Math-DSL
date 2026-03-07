// Generated from src/com/company/grammar/MathDSL.g4 by ANTLR 4.13.1
package com.company.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MathDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, LET=2, NUMBER=3, ID=4, LPAREN=5, RPAREN=6, COMMA=7, COLON=8, EQUAL=9, 
		PLUS=10, MINUS=11, MULTI=12, DIV=13, FACT=14, POWER=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_funDecl = 2, RULE_letDecl = 3, 
		RULE_exprStmt = 4, RULE_paramList = 5, RULE_param = 6, RULE_argList = 7, 
		RULE_unit = 8, RULE_baseUnit = 9, RULE_expr = 10, RULE_term = 11, RULE_factor = 12, 
		RULE_primary = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "funDecl", "letDecl", "exprStmt", "paramList", "param", 
			"argList", "unit", "baseUnit", "expr", "term", "factor", "primary"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				funDecl();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				letDecl();
				}
				break;
			case NUMBER:
			case ID:
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
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
			setState(41);
			match(FUN);
			setState(42);
			((FunDeclContext)_localctx).fname = match(ID);
			setState(43);
			match(LPAREN);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(44);
				paramList();
				}
			}

			setState(47);
			match(RPAREN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(48);
				match(COLON);
				setState(49);
				unit();
				}
			}

			setState(52);
			match(EQUAL);
			setState(53);
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
			setState(55);
			match(LET);
			setState(56);
			((LetDeclContext)_localctx).vname = match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(57);
				match(COLON);
				setState(58);
				unit();
				}
			}

			setState(61);
			match(EQUAL);
			setState(62);
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
			setState(66);
			param();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				param();
				}
				}
				setState(73);
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
		public TerminalNode ID() { return getToken(MathDSLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MathDSLParser.COLON, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((ParamContext)_localctx).pname = match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(75);
				match(COLON);
				setState(76);
				unit();
				}
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
			setState(79);
			expr(0);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				expr(0);
				}
				}
				setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				baseUnit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				baseUnit();
				setState(89);
				match(DIV);
				setState(90);
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
		public TerminalNode ID() { return getToken(MathDSLParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
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
			setState(97);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(100);
						match(PLUS);
						setState(101);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(103);
						match(MINUS);
						setState(104);
						term(0);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(111);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						match(MULTI);
						setState(115);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						match(DIV);
						setState(118);
						factor();
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				primary();
				setState(125);
				match(POWER);
				setState(126);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				primary();
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
		enterRule(_localctx, 26, RULE_primary);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(NUMBER);
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(132);
					unit();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(ID);
				setState(136);
				match(LPAREN);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
					{
					setState(137);
					argList();
					}
				}

				setState(140);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(LPAREN);
				setState(143);
				expr(0);
				setState(144);
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
		"\u0004\u0001\u0010\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007S\b\u0007\n\u0007\f\u0007V\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nj\b"+
		"\n\n\n\f\nm\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bx\b"+
		"\u000b\n\u000b\f\u000b{\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0082\b\f\u0001\r\u0001\r\u0003\r\u0086\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u008b\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0093\b\r\u0001\r\u0000\u0002\u0014\u0016\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000"+
		"\u009a\u0000\u001f\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004)\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b@\u0001"+
		"\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000"+
		"\u000eO\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012"+
		"^\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016n\u0001"+
		"\u0000\u0000\u0000\u0018\u0081\u0001\u0000\u0000\u0000\u001a\u0092\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001"+
		"\u0000\u0000\u0000$(\u0003\u0004\u0002\u0000%(\u0003\u0006\u0003\u0000"+
		"&(\u0003\b\u0004\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0001\u0000\u0000*+\u0005\u0004\u0000\u0000+-\u0005\u0005\u0000\u0000"+
		",.\u0003\n\u0005\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/2\u0005\u0006\u0000\u000001\u0005\b\u0000\u0000"+
		"13\u0003\u0010\b\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u0005\t\u0000\u000056\u0003\u0014\n\u0000"+
		"6\u0005\u0001\u0000\u0000\u000078\u0005\u0002\u0000\u00008;\u0005\u0004"+
		"\u0000\u00009:\u0005\b\u0000\u0000:<\u0003\u0010\b\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005"+
		"\t\u0000\u0000>?\u0003\u0014\n\u0000?\u0007\u0001\u0000\u0000\u0000@A"+
		"\u0003\u0014\n\u0000A\t\u0001\u0000\u0000\u0000BG\u0003\f\u0006\u0000"+
		"CD\u0005\u0007\u0000\u0000DF\u0003\f\u0006\u0000EC\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u000b\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JM\u0005"+
		"\u0004\u0000\u0000KL\u0005\b\u0000\u0000LN\u0003\u0010\b\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\r\u0001\u0000\u0000\u0000"+
		"OT\u0003\u0014\n\u0000PQ\u0005\u0007\u0000\u0000QS\u0003\u0014\n\u0000"+
		"RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u000f\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000W]\u0003\u0012\t\u0000XY\u0003\u0012\t\u0000YZ\u0005"+
		"\r\u0000\u0000Z[\u0003\u0012\t\u0000[]\u0001\u0000\u0000\u0000\\W\u0001"+
		"\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]\u0011\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0004\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`a\u0006"+
		"\n\uffff\uffff\u0000ab\u0003\u0016\u000b\u0000bk\u0001\u0000\u0000\u0000"+
		"cd\n\u0003\u0000\u0000de\u0005\n\u0000\u0000ej\u0003\u0016\u000b\u0000"+
		"fg\n\u0002\u0000\u0000gh\u0005\u000b\u0000\u0000hj\u0003\u0016\u000b\u0000"+
		"ic\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0015\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0006\u000b\uffff\uffff"+
		"\u0000op\u0003\u0018\f\u0000py\u0001\u0000\u0000\u0000qr\n\u0003\u0000"+
		"\u0000rs\u0005\f\u0000\u0000sx\u0003\u0018\f\u0000tu\n\u0002\u0000\u0000"+
		"uv\u0005\r\u0000\u0000vx\u0003\u0018\f\u0000wq\u0001\u0000\u0000\u0000"+
		"wt\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0017\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0003\u001a\r\u0000}~\u0005\u000f\u0000\u0000~\u007f"+
		"\u0003\u0018\f\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080\u0082\u0003"+
		"\u001a\r\u0000\u0081|\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0019\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0003"+
		"\u0000\u0000\u0084\u0086\u0003\u0010\b\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0093\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u008a\u0005\u0005\u0000"+
		"\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u0093\u0005\u0006\u0000\u0000\u008d\u0093\u0005\u0004\u0000"+
		"\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u0003\u0014\n\u0000"+
		"\u0090\u0091\u0005\u0006\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0083\u0001\u0000\u0000\u0000\u0092\u0087\u0001\u0000\u0000\u0000"+
		"\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000"+
		"\u0093\u001b\u0001\u0000\u0000\u0000\u0011\u001f\'-2;GMT\\ikwy\u0081\u0085"+
		"\u008a\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}