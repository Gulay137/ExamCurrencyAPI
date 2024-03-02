package com.example.currencyapi.controller;

import com.example.currencyapi.model.ExchangeRate;
import com.example.currencyapi.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/exchange-rates")
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    @Autowired
    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping
    public ResponseEntity<List<ExchangeRate>> getAllExchangeRates() {
        List<ExchangeRate> exchangeRates = exchangeRateService.getAllExchangeRates();
        return ResponseEntity.ok(exchangeRates);
    }

    @PostMapping
    public ResponseEntity<ExchangeRate> createExchangeRate(@RequestBody ExchangeRate exchangeRate) {
        ExchangeRate savedExchangeRate = exchangeRateService.saveExchangeRate(exchangeRate);
        return new ResponseEntity<>(savedExchangeRate, HttpStatus.CREATED);
    }
}
