package com.company.core.semantic.unit;

import java.util.Map;

public class UnitRegistry {
    public static final Map<String,UnitInfo> UNIT_TABLE = Map.of(
            "ms", new UnitInfo(Dimension.TIME, 0.001),
            "s",  new UnitInfo(Dimension.TIME, 1.0),
            "h",  new UnitInfo(Dimension.TIME, 3600.0),

            "cm", new UnitInfo(Dimension.LENGTH, 0.01),
            "m",  new UnitInfo(Dimension.LENGTH, 1.0),
            "km", new UnitInfo(Dimension.LENGTH, 1000.0),

            "g",  new UnitInfo(Dimension.MASS, 1.0),
            "kg", new UnitInfo(Dimension.MASS, 1000.0),

            "m/s",  new UnitInfo(Dimension.SPEED, 1.0),
            "km/h", new UnitInfo(Dimension.SPEED, 1000.0/3600.0)

            );
}
