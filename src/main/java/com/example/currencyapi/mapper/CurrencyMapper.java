package com.example.currencyapi.mapper;


import com.example.currencyapi.dto.CurrencyExchangeRequestDTO;
import com.example.currencyapi.model.Currency;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {

    @Mapping(target = "id", ignore = true)
    Currency toEntity(CurrencyExchangeRequestDTO dto);
}
