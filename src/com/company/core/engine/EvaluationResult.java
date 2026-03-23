package com.company.core.engine;

import com.company.core.unit.Dimension;

public record EvaluationResult(double value, Dimension dimension) {

    @Override
    public String toString() {
        return value + " [" + dimension.toReadableString() + "]";
    }

}
