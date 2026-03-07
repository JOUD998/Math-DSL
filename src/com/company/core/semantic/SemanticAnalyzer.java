package com.company.core.semantic;
import com.company.core.model.*;
import com.company.core.model.function.*;
import com.company.core.model.statment.StatementNode;
import com.company.core.model.unit.BaseUnitNode;
import com.company.core.model.unit.UnitNode;
import com.company.core.semantic.unit.Dimension;
import com.company.core.semantic.unit.UnitInfo;
import com.company.core.semantic.unit.UnitRegistry;

public class SemanticAnalyzer implements ASTVisitor<Void> {

    @Override
    public Void visitProgramNode(ProgramNode node) {
        for (ASTNode stmt : node.statements) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visitExprStmtNode(ExprStmtNode node) {
        System.out.println("Visiting ExprStmtNode");
        node.expr.accept(this);
        return null;
    }

    @Override
    public Void visitVariableNode(VariableNode node) {
        if (node.unit != null) {
            node.unit.accept(this);
        }

        node.expression.accept(this);

        return null;
    }

    @Override
    public Void visitBinaryOpNode(BinaryOpNode node) {
        node.left.accept(this);
        node.right.accept(this);

        // Example for + and - (only same dimension allowed)
        if (node.op == '+' || node.op == '-') {
            if (node.left.dimension == node.right.dimension) {
                System.out.println("Dimension match: " + node.left.dimension + " " + node.op + " " + node.right.dimension);
                node.dimension = node.left.dimension;
            } else {
                node.dimension = Dimension.NONE;
                System.out.println("Semantic Error: Dimension mismatch: " + node.left.dimension + " " + node.op + " " + node.right.dimension);
            }
        } else if (node.op == '*') {
            // مثال: LENGTH * TIME → NONE أو حسب جدولك
            node.dimension = Dimension.NONE; // ممكن توسع لاحقًا
        } else if (node.op == '/') {
            node.dimension = Dimension.NONE; // ممكن LENGTH / TIME → SPEED
        }

        System.out.println("BinaryOpNode Dimension: " + node.dimension);

        return null;
    }

    @Override
    public Void visitNumberLiteralNode(NumberLiteralNode node) {

        if (node.unitNode != null) {
            node.unitNode.accept(this);

            node.dimension = node.unitNode.dimension;
            node.toBaseFactor = node.unitNode.toBaseFactor;
        } else {
            node.dimension = Dimension.NONE;
            node.toBaseFactor = 1.0;
        }

        return null;
    }

    // باقي visit methods ممكن تتركها فارغة مؤقتًا
    @Override
    public Void visitPowerNode(PowerNode node) {
        return null;
    }

    @Override
    public Void visitIntNode(IntNode node) {
        return null;
    }

    @Override
    public Void visitFactorialNode(FactorialNode node) {
        return null;
    }

    @Override
    public Void visitTermNode(TermNode node) {
        return null;
    }

    @Override
    public Void visitFunDeclNode(FunDeclNode node) {
        return null;
    }

    @Override
    public Void visitFunctionNode(FunctionNode node) {
        return null;
    }

    @Override
    public Void visitFuncCallNode(FuncCallNode node) {
        return null;
    }

    @Override
    public Void visitParamListNode(ParamListNode node) {
        return null;
    }

    @Override
    public Void visitParamNode(ParamNode node) {
        return null;
    }

    @Override
    public Void visitIdNode(IdNode node) {
        return null;
    }

    @Override
    public Void visitStatementNode(StatementNode node) {
        return null;
    }


    @Override
    public Void visitBaseUnitNode(BaseUnitNode node) {

        if (UnitRegistry.UNIT_TABLE.containsKey(node.symbol)) {
            UnitInfo unitInfo = UnitRegistry.UNIT_TABLE.get(node.symbol);
            node.dimension = unitInfo.getUnitCategory();
            node.toBaseFactor = unitInfo.getToBaseFactor();

        } else {

            node.dimension = Dimension.NONE;
            node.toBaseFactor = 1.0;
            System.out.println("Unbekannte Einheit: " + node.symbol);
        }
        return null;
    }

    @Override
    public Void visitUnitNode(UnitNode node) {

        node.left.accept(this);
        if (node.isDivision()) {
            node.right.accept(this);
        }

        if (!node.isDivision()) {
            node.dimension = node.left.dimension;
            node.toBaseFactor = node.left.toBaseFactor;
        } else {
            // مثال: LENGTH / TIME → SPEED
            if (node.left.dimension == Dimension.LENGTH && node.right.dimension == Dimension.TIME) {
                node.dimension = Dimension.SPEED;
                node.toBaseFactor = node.left.toBaseFactor / node.right.toBaseFactor;
            } else {
                node.dimension = Dimension.NONE;
                node.toBaseFactor = 1.0;
                System.out.println("Invalid unit division: " + node.left.symbol + " / " + node.right.symbol);
            }
        }

        System.out.println("Visiting UnitNode: " + node.left.symbol +
                (node.isDivision() ? " / " + node.right.symbol : "") +
                " -> Dimension: " + node.dimension + ", Factor: " + node.toBaseFactor);

        return null;
    }
}