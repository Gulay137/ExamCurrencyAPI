package com.example.currencyapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchangeResponseDTO {
    private Long id;
    private double exchangedValue;
    private String fromCurrency;
    private String toCurrency;
    private double exchangeRate;
}
