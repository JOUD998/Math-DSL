package com.company.core.model;

import com.company.core.semantic.ASTVisitor;

public class IdNode extends ASTNode {
    public String name;
    public IdNode(String name){this.name = name;}

    @Override
    public String toJson() {
        return "{ \"type\": \"Id\", \"name\": \"" + name + "\" }";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitIdNode(this);
    }
}
