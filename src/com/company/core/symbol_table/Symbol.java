package com.company.core.symbol_table;

import com.company.core.model.unit.UnitNode;

public abstract class Symbol {

    private final String name;
    private final UnitNode unit;

    protected Symbol(String name, UnitNode unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public UnitNode getUnit() {
        return unit;
    }
}