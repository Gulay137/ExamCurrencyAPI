package com.example.currencyapi.repository;


import com.example.currencyapi.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

}
