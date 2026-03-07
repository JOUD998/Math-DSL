package com.company.core.semantic.unit;

public class UnitInfo {
    private final Dimension dimension;
    private final double toBaseFactor;

    public UnitInfo(Dimension dimension, double toBaseFactor) {
        this.dimension = dimension;
        this.toBaseFactor = toBaseFactor;
    }

    public Dimension getUnitCategory() {
        return dimension;
    }

    public double getToBaseFactor() {
        return toBaseFactor;
    }
}
