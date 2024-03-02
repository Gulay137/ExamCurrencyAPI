package com.example.currencyapi.service;


import com.example.currencyapi.model.ExchangeRate;
import com.example.currencyapi.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;

    @Autowired
    public ExchangeRateService(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    public List<ExchangeRate> getAllExchangeRates() {
        return exchangeRateRepository.findAll();
    }

    public Optional<ExchangeRate> getExchangeRateById(Long id) {
        return exchangeRateRepository.findById(id);
    }

    public ExchangeRate saveExchangeRate(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    public void deleteExchangeRate(Long id) {
        exchangeRateRepository.deleteById(id);
    }
}
