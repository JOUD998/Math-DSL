package com.company.core.ast;

import com.company.core.ast.statment.StatementNode;
import com.company.core.semantic.ASTVisitor;

public class ExprStmtNode extends StatementNode {

    public ASTNode expr;


    public ExprStmtNode(ASTNode expr) {
        this.expr = expr;
    }

    @Override
    public String toJson() {
        return "{ \"type\": \"ExprStmt\", \"expr\": " + (expr != null ? expr.toJson() : "null") + " }";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitExprStmtNode(this);
    }

}
