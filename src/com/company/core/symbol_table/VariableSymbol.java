package com.company.core.symbol_table;

import com.company.core.model.ASTNode;
import com.company.core.model.unit.UnitNode;

public class VariableSymbol extends Symbol {

    private final ASTNode value;

    public VariableSymbol(String name, UnitNode unit, ASTNode value) {
        super(name, unit);
        this.value = value;
    }

    public ASTNode getValue() {
        return value;
    }
}