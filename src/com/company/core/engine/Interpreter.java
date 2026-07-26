package com.company.core.engine;

import com.company.core.ast.*;
import com.company.core.ast.function.*;
import com.company.core.ast.statment.StatementNode;
import com.company.core.ast.unit.BaseUnitNode;
import com.company.core.ast.unit.UnitNode;
import com.company.core.semantic.ASTVisitor;
import com.company.core.unit.Dimension;
import com.company.core.symbol_table.*;

import java.util.ArrayList;
import java.util.List;

public class Interpreter implements ASTVisitor<EvaluationResult> {

    private SymbolTable currentScope;

    public Interpreter(SymbolTable scope) {
        this.currentScope = scope;
    }

    @Override
    public EvaluationResult visitProgramNode(ProgramNode node) {
        EvaluationResult lastResult = null;
        for (ASTNode statement : node.statements) {
            lastResult = statement.accept(this);
        }
        return lastResult;
    }

    @Override
    public EvaluationResult visitStatementNode(StatementNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitExprStmtNode(ExprStmtNode node) {

        return node.expr.accept(this);
    }

    @Override
    public EvaluationResult visitVariableNode(VariableNode node) {
        EvaluationResult exprResult = node.expression.accept(this);
        Symbol symbol = currentScope.resolve(node.varId.name);
        Dimension finalDim = exprResult.dimension();

        if (symbol instanceof VariableSymbol vs) {
            if (!vs.getDimension().isNone()) {
                finalDim = vs.getDimension();
            }

            vs.setValue(exprResult.value());
        }

        return new EvaluationResult(exprResult.value(), finalDim);

    }

    @Override
    public EvaluationResult visitBinaryOpNode(BinaryOpNode node) {
        EvaluationResult left = node.left.accept(this);
        EvaluationResult right = node.right.accept(this);

        return switch (node.op) {
            case '+' -> new EvaluationResult(left.value() + right.value(), left.dimension());
            case '-' -> new EvaluationResult(left.value() - right.value(), left.dimension());
            case '*' ->
                    new EvaluationResult(left.value() * right.value(), left.dimension().multiply(right.dimension()));
            case '/' -> new EvaluationResult(left.value() / right.value(), left.dimension().divide(right.dimension()));
            default -> throw new RuntimeException("Operator not implemented: " + node.op);
        };

    }

    @Override
    public EvaluationResult visitPowerNode(PowerNode node) {

        EvaluationResult base = node.base.accept(this);
        EvaluationResult exp = node.exponent.accept(this);

        int exponentInt = (int) exp.value();
        double resultValue = Math.pow(base.value(), exponentInt);

        Dimension resultDim = base.dimension();
        for (int i = 1; i < exponentInt; i++) {
            resultDim = resultDim.multiply(base.dimension());
        }

        return new EvaluationResult(resultValue, resultDim);
    }

    @Override
    public EvaluationResult visitNumberLiteralNode(NumberLiteralNode node) {
        return new EvaluationResult(node.value, node.dimension);
    }

    @Override
    public EvaluationResult visitIntNode(IntNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitFactorialNode(FactorialNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitTermNode(TermNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitFunctionNode(FunctionNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitFunDeclNode(FunDeclNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitFuncCallNode(FuncCallNode node) {

        FunctionSymbol fs = (FunctionSymbol) currentScope.resolve(node.getName().name);

        List<EvaluationResult> argResults = new ArrayList<>();

        for (ASTNode arg : node.args) {
            argResults.add(arg.accept(this));
        }

        SymbolTable executionScope = new SymbolTable(fs.getScope());

        for (int i = 0; i < fs.getParameters().size(); i++) {
            String paramName = fs.getParameters().get(i).name;
            EvaluationResult res = argResults.get(i);

            VariableSymbol vs = new VariableSymbol(paramName, res.dimension(), null);
            vs.setValue(res.value());
            executionScope.define(vs);
        }

        SymbolTable previousScope = this.currentScope;

        this.currentScope = executionScope;

        try {
            return fs.getBody().accept(this);
        } finally {
            this.currentScope = previousScope;

        }
    }

    @Override
    public EvaluationResult visitParamListNode(ParamListNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitParamNode(ParamNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitIdNode(IdNode node) {
        Symbol symbol = currentScope.resolve(node.name);

        if (symbol instanceof VariableSymbol vs) {
            return new EvaluationResult(vs.getValue(), vs.getDimension());
        }

        throw new RuntimeException("Error: Variable '" + node.name + "' is not defined.");
    }

    @Override
    public EvaluationResult visitUnitNode(UnitNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitBaseUnitNode(BaseUnitNode node) {
        return null;
    }

    @Override
    public EvaluationResult visitIfNode(IfNode node) {
        EvaluationResult conditionRes = node.condition.accept(this);
        if (conditionRes.value() != 0) {
            return node.thenBranch.accept(this);
        } else {
            return node.elseBranch.accept(this);
        }

    }
}
