package com.example.currencyapi.service;

import com.example.currencyapi.exceptions.CurrencyExchangeException;
import com.example.currencyapi.model.Currency;
import com.example.currencyapi.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public double exchangeCurrency(LocalDate date, String fromCurrency, String toCurrency, double value) {

        if (fromCurrency.equals(toCurrency)) {
            return value;
        } else {
            throw new CurrencyExchangeException(null, "Conversion is not supported.");

        }
    }

    public List<String> getAllCurrencyCodes() {
        return currencyRepository.findAllCurrencyCodes();
    }
}
