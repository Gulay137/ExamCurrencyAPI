package com.example.currencyapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchangeRequestDTO {

    @NotNull
    private LocalDate date;

    @NotNull
    private String fromCurrency;

    @NotNull
    private String toCurrency;

    @NotNull
    private double value;
}
