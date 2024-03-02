package com.example.currencyapi.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoggingDTO {
    private LocalDateTime timestamp;
    private String ipAddress;
    private String message;

}
