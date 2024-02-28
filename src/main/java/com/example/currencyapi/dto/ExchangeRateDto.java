package com.example.currencyapi.dto;

import com.example.currencyapi.model.Currency;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@ToString
public class ExchangeRateDto {

    @NotBlank
    private Currency sourceCurrency;

    @NotBlank
    private Currency targetCurrency;

    @NotBlank
    private BigDecimal rate;

    @NotBlank
    private LocalDate date;
}
