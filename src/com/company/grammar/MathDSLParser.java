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
		FUN=1, LET=2, IF=3, THEN=4, ELSE=5, NUMBER=6, ID=7, LPAREN=8, RPAREN=9, 
		COMMA=10, COLON=11, EQUAL=12, PLUS=13, MINUS=14, MULTI=15, DIV=16, FACT=17, 
		POWER=18, SEMI=19, WS=20;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 462L) != 0)) {
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
		public TerminalNode SEMI() { return getToken(MathDSLParser.SEMI, 0); }
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				funDecl();
				setState(37);
				match(SEMI);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				letDecl();
				setState(40);
				match(SEMI);
				}
				break;
			case IF:
			case NUMBER:
			case ID:
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				exprStmt();
				setState(43);
				match(SEMI);
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
			setState(47);
			match(FUN);
			setState(48);
			((FunDeclContext)_localctx).fname = match(ID);
			setState(49);
			match(LPAREN);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(50);
				paramList();
				}
			}

			setState(53);
			match(RPAREN);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(54);
				match(COLON);
				setState(55);
				unit();
				}
			}

			setState(58);
			match(EQUAL);
			setState(59);
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
			setState(61);
			match(LET);
			setState(62);
			((LetDeclContext)_localctx).vname = match(ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(63);
				match(COLON);
				setState(64);
				unit();
				}
			}

			setState(67);
			match(EQUAL);
			setState(68);
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
			setState(70);
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
			setState(72);
			param();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				param();
				}
				}
				setState(79);
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
			setState(80);
			((ParamContext)_localctx).pname = match(ID);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(81);
				match(COLON);
				setState(82);
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
			setState(85);
			expr(0);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86);
				match(COMMA);
				setState(87);
				expr(0);
				}
				}
				setState(92);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				baseUnit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				baseUnit();
				setState(95);
				match(DIV);
				setState(96);
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
			setState(100);
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
			setState(103);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106);
						match(PLUS);
						setState(107);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						match(MINUS);
						setState(110);
						term(0);
						}
						break;
					}
					} 
				}
				setState(115);
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
			setState(117);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(MULTI);
						setState(121);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123);
						match(DIV);
						setState(124);
						factor();
						}
						break;
					}
					} 
				}
				setState(129);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				primary();
				setState(131);
				match(POWER);
				setState(132);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IF() { return getToken(MathDSLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(MathDSLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MathDSLParser.ELSE, 0); }
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(NUMBER);
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(138);
					unit();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				setState(142);
				match(LPAREN);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0)) {
					{
					setState(143);
					argList();
					}
				}

				setState(146);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(LPAREN);
				setState(149);
				expr(0);
				setState(150);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(IF);
				setState(153);
				expr(0);
				setState(154);
				match(THEN);
				setState(155);
				expr(0);
				setState(156);
				match(ELSE);
				setState(157);
				expr(0);
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
		"\u0004\u0001\u0014\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007Y\b\u0007\n\u0007\f\u0007\\\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\np\b"+
		"\n\n\n\f\ns\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b~\b"+
		"\u000b\n\u000b\f\u000b\u0081\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0088\b\f\u0001\r\u0001\r\u0003\r\u008c\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0091\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a0"+
		"\b\r\u0001\r\u0000\u0002\u0014\u0016\u000e\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u00a8\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004/\u0001\u0000"+
		"\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000"+
		"\nH\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000eU\u0001\u0000"+
		"\u0000\u0000\u0010b\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000"+
		"\u0014f\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000\u0000\u0018\u0087"+
		"\u0001\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$%\u0003\u0004"+
		"\u0002\u0000%&\u0005\u0013\u0000\u0000&.\u0001\u0000\u0000\u0000\'(\u0003"+
		"\u0006\u0003\u0000()\u0005\u0013\u0000\u0000).\u0001\u0000\u0000\u0000"+
		"*+\u0003\b\u0004\u0000+,\u0005\u0013\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-$\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000"+
		"\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000\u000001\u0005"+
		"\u0007\u0000\u000013\u0005\b\u0000\u000024\u0003\n\u0005\u000032\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"58\u0005\t\u0000\u000067\u0005\u000b\u0000\u000079\u0003\u0010\b\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0005\f\u0000\u0000;<\u0003\u0014\n\u0000<\u0005\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0002\u0000\u0000>A\u0005\u0007\u0000\u0000?@\u0005"+
		"\u000b\u0000\u0000@B\u0003\u0010\b\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\f\u0000\u0000DE\u0003"+
		"\u0014\n\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0003\u0014\n\u0000G\t"+
		"\u0001\u0000\u0000\u0000HM\u0003\f\u0006\u0000IJ\u0005\n\u0000\u0000J"+
		"L\u0003\f\u0006\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000b\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PS\u0005\u0007\u0000\u0000QR\u0005"+
		"\u000b\u0000\u0000RT\u0003\u0010\b\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000UZ\u0003\u0014\n\u0000VW"+
		"\u0005\n\u0000\u0000WY\u0003\u0014\n\u0000XV\u0001\u0000\u0000\u0000Y"+
		"\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u000f\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]c\u0003"+
		"\u0012\t\u0000^_\u0003\u0012\t\u0000_`\u0005\u0010\u0000\u0000`a\u0003"+
		"\u0012\t\u0000ac\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001"+
		"\u0000\u0000\u0000c\u0011\u0001\u0000\u0000\u0000de\u0005\u0007\u0000"+
		"\u0000e\u0013\u0001\u0000\u0000\u0000fg\u0006\n\uffff\uffff\u0000gh\u0003"+
		"\u0016\u000b\u0000hq\u0001\u0000\u0000\u0000ij\n\u0003\u0000\u0000jk\u0005"+
		"\r\u0000\u0000kp\u0003\u0016\u000b\u0000lm\n\u0002\u0000\u0000mn\u0005"+
		"\u000e\u0000\u0000np\u0003\u0016\u000b\u0000oi\u0001\u0000\u0000\u0000"+
		"ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\u0015\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0006\u000b\uffff\uffff\u0000uv\u0003\u0018\f\u0000"+
		"v\u007f\u0001\u0000\u0000\u0000wx\n\u0003\u0000\u0000xy\u0005\u000f\u0000"+
		"\u0000y~\u0003\u0018\f\u0000z{\n\u0002\u0000\u0000{|\u0005\u0010\u0000"+
		"\u0000|~\u0003\u0018\f\u0000}w\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0017\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084"+
		"\u0005\u0012\u0000\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0003\u001a\r\u0000\u0087\u0082\u0001\u0000"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0019\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0005\u0006\u0000\u0000\u008a\u008c\u0003\u0010"+
		"\b\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u00a0\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0007\u0000"+
		"\u0000\u008e\u0090\u0005\b\u0000\u0000\u008f\u0091\u0003\u000e\u0007\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u00a0\u0005\t\u0000\u0000\u0093"+
		"\u00a0\u0005\u0007\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096"+
		"\u0003\u0014\n\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u00a0\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009a\u0003"+
		"\u0014\n\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b\u009c\u0003\u0014"+
		"\n\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d\u009e\u0003\u0014\n"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0089\u0001\u0000\u0000"+
		"\u0000\u009f\u008d\u0001\u0000\u0000\u0000\u009f\u0093\u0001\u0000\u0000"+
		"\u0000\u009f\u0094\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000"+
		"\u0000\u00a0\u001b\u0001\u0000\u0000\u0000\u0011\u001f-38AMSZboq}\u007f"+
		"\u0087\u008b\u0090\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}