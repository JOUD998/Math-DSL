package com.company.core.model;

import com.company.core.semantic.ASTVisitor;

public class IfNode extends ASTNode{
    public ASTNode condition;
    public ASTNode thenBranch;
    public ASTNode elseBranch;

    public IfNode(ASTNode condition, ASTNode thenBranch, ASTNode elseBranch) {
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitIfNode(this);
    }

    @Override
    public String toJson() {
        return "{ \"type\": \"If\", " +
                "\"condition\": " + condition.toJson() + "," +
                "\"then\": " + thenBranch.toJson() + "," +
                "\"else\": " + elseBranch.toJson() + "}";
    }
}
