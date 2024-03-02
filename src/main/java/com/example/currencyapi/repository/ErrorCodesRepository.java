package com.example.currencyapi.repository;


import com.example.currencyapi.model.ErrorCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorCodesRepository extends JpaRepository<ErrorCodes, Long> {
    ErrorCodes findByErrorCode(String errorCode);
}
