package com.company.core.model;

import com.company.core.semantic.ASTVisitor;

public class PowerNode extends ASTNode {
    public ASTNode base;
    public ASTNode exponent;

    public PowerNode(ASTNode base, ASTNode exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public String toJson() {
        return "{ \"type\": \"Power\", \"base\": " + base.toJson() + ", \"exponent\": " + exponent.toJson() + " }";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitPowerNode(this);
    }
}