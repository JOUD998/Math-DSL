package com.company.core.ast;

import com.company.core.ast.unit.UnitNode;
import com.company.core.semantic.ASTVisitor;

public class NumberLiteralNode extends ASTNode {

    public double value;
    public UnitNode unitNode;

    public NumberLiteralNode(double value, UnitNode unitNode){
        this.value = value;
        this.unitNode = unitNode;
    }


    @Override
    public String toJson() {

        if (unitNode == null) {
            return "{\n" +
                    "  \"type\": \"NumberLiteral\",\n" +
                    "  \"value\": " + value + "\n" +
                    "}";
        }

        return "{\n" +
                "  \"type\": \"NumberLiteral\",\n" +
                "  \"value\": " + value + ",\n" +
                "  \"UnitNode\": " + unitNode.toJson() + "\n" +
                "}";
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNumberLiteralNode(this);
    }
}
