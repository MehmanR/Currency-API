package com.example.currencyapi.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@ToString
@Builder

public class CurrencyDto {

    @NotBlank
    @Size(min = 1,max = 10)
    private String currencyCode;

    @NotBlank
    @Size(min = 1,max = 255)
    private String currencyName;
}
