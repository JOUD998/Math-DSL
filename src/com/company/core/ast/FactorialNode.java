package com.company.core.ast;

import com.company.core.semantic.ASTVisitor;

public class FactorialNode extends ASTNode {

    public ASTNode child;
    public FactorialNode(ASTNode child) {this.child = child;}

    @Override
    public String toJson() {
        return "{ \"type\": \"Factorial\", \"child\": " + child.toJson() +  " } Ich muss heir was andern ";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitFactorialNode(this);
    }
}
