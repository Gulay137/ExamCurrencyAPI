package com.example.currencyapi.controller;

import com.example.currencyapi.dto.CurrencyExchangeRequestDTO;
import com.example.currencyapi.exceptions.CurrencyExchangeException;
import com.example.currencyapi.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    private static final Logger logger = LoggerFactory.getLogger(CurrencyController.class);

    @PostMapping("/currency/exchange")
    public ResponseEntity<Double> exchangeCurrency(@RequestBody CurrencyExchangeRequestDTO request) {
        try {
            double exchangeRate = currencyService.exchangeCurrency(request.getDate(), request.getFromCurrency(), request.getToCurrency(), request.getValue());
            return ResponseEntity.ok(exchangeRate);
        } catch (CurrencyExchangeException e) {
            logger.error("An error occurred while exchanging .", e);
            throw e;
        }
    }

    @GetMapping("/currencies")
    public ResponseEntity<List<String>> getAllCurrencyCodes() {
        List<String> currencyCodes = currencyService.getAllCurrencyCodes();
        return ResponseEntity.ok(currencyCodes);
    }
}
