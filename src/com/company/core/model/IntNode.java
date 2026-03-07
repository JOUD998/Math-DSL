package com.company.core.model;

import com.company.core.semantic.ASTVisitor;

public class IntNode extends ASTNode {
    public int value;

    public IntNode(int value){this.value = value;}


    @Override
    public String toJson() {
        return "{ \"type\": \"Int\", \"value\": " + value +  " } ";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitIntNode(this);
    }
}
