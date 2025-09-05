package com.unitconve.converter.domain;

public class ConversionResponse {
    private Double value;
    private  String fromUnit;
    private String toUnit;
    private Double result;

    public ConversionResponse(Double value, String fromUnit, String toUnit, Double result) {
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.result = result;
    }

    public  ConversionResponse () {

    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
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

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
