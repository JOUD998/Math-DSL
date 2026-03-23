package com.company.core.symbol_table;
import java.util.List;

import com.company.core.ast.ASTNode;
import com.company.core.ast.function.ParamNode;
import com.company.core.unit.Dimension;

public class FunctionSymbol extends Symbol {

    private List<ParamNode> parameters;
    private Dimension dimension;
    private SymbolTable scope;
    private ASTNode body;

    public FunctionSymbol(String name, List<ParamNode> parameters, Dimension dimension, ASTNode body) {
        super(name);
        this.parameters = parameters;
        this.dimension = dimension;
        this.body = body;
    }

    public ASTNode getBody() {
        return body;
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