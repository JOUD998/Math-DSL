package com.company.core.semantic;

import com.company.core.ast.*;
import com.company.core.ast.function.*;
import com.company.core.ast.statment.StatementNode;
import com.company.core.ast.unit.BaseUnitNode;
import com.company.core.ast.unit.UnitNode;

public interface ASTVisitor<T> {

    // Program
    T visitProgramNode(ProgramNode node);

    // Statements
    T visitStatementNode(StatementNode node);
    T visitExprStmtNode(ExprStmtNode node);

    // Variables
    T visitVariableNode(VariableNode node);

    // Expressions / Terms / Factors
    T visitBinaryOpNode(BinaryOpNode node);
    T visitPowerNode(PowerNode node);
    T visitNumberLiteralNode(NumberLiteralNode node);
    T visitIntNode(IntNode node);
    T visitFactorialNode(FactorialNode node);
    T visitTermNode(TermNode node);

    // Functions
    T visitFunDeclNode(FunDeclNode node);
    T visitFunctionNode(FunctionNode node);
    T visitFuncCallNode(FuncCallNode node);
    T visitParamListNode(ParamListNode node);
    T visitParamNode(ParamNode node);
    T visitIdNode(IdNode node);

    // Units
    T visitUnitNode(UnitNode node);
    T visitBaseUnitNode(BaseUnitNode node);
    T visitIfNode(IfNode node);

}
