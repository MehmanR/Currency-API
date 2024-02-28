package com.example.currencyapi.controller;

import com.example.currencyapi.dto.CurrencyDto;
import com.example.currencyapi.model.Currency;
import com.example.currencyapi.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/currency")
@RequiredArgsConstructor
public class CurrencyController {

    private final CurrencyService currencyService;

    @PostMapping
    public ResponseEntity<Currency> addCurrency(@RequestBody CurrencyDto currencyDto){

        Currency addedCurrency = currencyService.addCurrency(currencyDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(addedCurrency);


    }
    /*
    @PostMapping()
    public ResponseEntity<RegisterDto> createUser(@Valid @RequestBody RegisterDto userDto) {

        RegisterDto user = userService.createUser(userDto);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
     */

}
