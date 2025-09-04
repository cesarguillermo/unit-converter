package com.unitconve.converter.domain;

public class Conversion {

    private  double value;
    private String fromUnit;
    private String toUnit;

    public Conversion(double value, String fromUnit, String toUnit) {
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public Conversion () {

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }
}
