package com.company.core.symbol_table;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private final Map<String, Symbol> symbols;
    private final SymbolTable parent;

    // Constructor للـ global scope
    public SymbolTable() {
        this(null);
    }

    // Constructor لأي child scope
    public SymbolTable(SymbolTable parent) {
        this.symbols = new HashMap<>();
        this.parent = parent;
    }

    public SymbolTable getParent() {
        return parent;
    }

    public Symbol lookup(String name) {
        Symbol symbol = symbols.get(name);

        if (symbol != null) {
            return symbol;
        }

        if (parent != null) {
            return parent.lookup(name);
        }

        return null; // not defined
    }

    public void define(Symbol symbol) {
        if (symbols.containsKey(symbol.getName())) {
            throw new RuntimeException(
                    "Symbol '" + symbol.getName() + "' already defined in this scope"
            );
        }

        symbols.put(symbol.getName(), symbol);
    }
}