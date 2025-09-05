package com.unitconve.converter.controllers;

import com.unitconve.converter.domain.Conversion;
import com.unitconve.converter.domain.ConversionResponse;
import com.unitconve.converter.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/conversion")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    private final List <ConversionResponse> history = new ArrayList<>();
    @PostMapping
    public ResponseEntity<?> unitConversion (@RequestBody Conversion request) {
       try {
           Double result = conversionService.convert(
                   request.getValue(),
                   request.getFromUnit(),
                   request.getToUnit()
           );

           ConversionResponse response = new ConversionResponse(
                   request.getValue(),
                   request.getFromUnit(),
                   request.getToUnit(),
                   result
           );
           history.add(response);

           return ResponseEntity.ok(response);
       } catch ( IllegalArgumentException e) {
           return ResponseEntity.badRequest().body(Map.of(
                   "error", e.getMessage()
           ));
       }
    }

}
