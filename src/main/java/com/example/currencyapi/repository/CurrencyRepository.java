package com.example.currencyapi.repository;

import com.example.currencyapi.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Currency findByCode(String code);

    List<String> findAllCurrencyCodes();
}
