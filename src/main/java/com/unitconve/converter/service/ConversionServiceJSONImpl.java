package com.unitconve.converter.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConversionServiceJSONImpl  implements  ConversionService{

    private  static final Map<String, Map <String, Double>> weightFactors = Map.of(
            "kilogramos", Map.of("gramos", 1000.0, "libras", 2.20462, "onzas", 35.274),
            "gramos", Map.of("kilogramos", 0.001, "miligramos", 1000.0),
            "miligramos", Map.of("gramos", 0.001),
            "libras", Map.of("kilogramos", 0.453592, "onzas", 16.0),
            "onzas", Map.of("gramos", 28.3495, "libras", 0.0625)
    );


    @Override
    public Double convert(double value, String fromUnit, String toUnit) {
       fromUnit =  fromUnit.toLowerCase();
       toUnit = toUnit.toLowerCase();

      return value * weightFactors.get(fromUnit).get(toUnit);
    }
}
