package com.company.core.model.unit;

import com.company.core.model.ASTNode;
import com.company.core.semantic.ASTVisitor;

public class BaseUnitNode extends ASTNode {

    public String symbol;
    public double toBaseFactor;  // للتحويل للوحدة الأساسية

    public BaseUnitNode(String symbol){
        this.symbol = symbol;
        this.toBaseFactor = 1.0;
    }



    @Override
    public String toJson() {
        return "{\n" +
                "  \"type\": \"BaseUnitNode\",\n" +
                "  \"Symbol\": \"" + symbol + "\"\n" +
                "}";
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitBaseUnitNode(this);
    }


}
