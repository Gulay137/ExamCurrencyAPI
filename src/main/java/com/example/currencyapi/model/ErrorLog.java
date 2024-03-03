package com.example.currencyapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String errorCode;

    @Column(nullable = false)
    private String errorMessage;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private String ipAddress;
}
