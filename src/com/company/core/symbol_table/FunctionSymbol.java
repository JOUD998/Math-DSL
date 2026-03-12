package com.company.core.symbol_table;
import java.util.List;

import com.company.core.model.function.ParamNode;
import com.company.core.semantic.unit.Dimension;

public class FunctionSymbol extends Symbol {

    private List<ParamNode> parameters;
    private Dimension dimension;
    private SymbolTable scope; // << هنا ضفناه

    public FunctionSymbol(String name, List<ParamNode> parameters, Dimension dimension) {
        super(name);
        this.parameters = parameters;
        this.dimension = dimension;
    }

    public List<ParamNode> getParameters() {
        return parameters;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public SymbolTable getScope() {
        return scope;
    }

    public void setScope(SymbolTable scope) {
        this.scope = scope;
    }
}