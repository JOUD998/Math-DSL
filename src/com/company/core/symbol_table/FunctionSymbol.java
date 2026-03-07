package com.company.core.symbol_table;

import com.company.core.model.ASTNode;
import com.company.core.model.function.ParamNode;
import com.company.core.model.unit.UnitNode;

import java.util.List;

public class FunctionSymbol extends Symbol {

    private final List<ParamNode> params;
    private final UnitNode returnType;
    private final ASTNode body;

    public FunctionSymbol(String name,
                          UnitNode unit,
                          List<ParamNode> params,
                          UnitNode returnType,
                          ASTNode body) {

        super(name, unit);
        this.params = params;
        this.returnType = returnType;
        this.body = body;
    }

    public List<ParamNode> getParams() {
        return params;
    }

    public UnitNode getReturnType() {
        return returnType;
    }

    public ASTNode getBody() {
        return body;
    }
}