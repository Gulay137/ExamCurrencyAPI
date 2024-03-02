package com.example.currencyapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ErrorLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String errorCode;
    private String errorMessage;
    private LocalDateTime timestamp;
    private String ipAddress;

}
