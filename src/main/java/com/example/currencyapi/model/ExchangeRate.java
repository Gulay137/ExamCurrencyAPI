

package com.example.currencyapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exchange_rate")
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_currency_id", referencedColumnName = "id")
    private Currency fromCurrency;

    @ManyToOne
    @JoinColumn(name = "to_currency_id", referencedColumnName = "id")
    private Currency toCurrency;

    @Column(nullable = false)
    private Double rate;

    @Column(nullable = false)
    private LocalDate date;
}
