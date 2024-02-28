package com.example.currencyapi.service;

import com.example.currencyapi.dto.CurrencyDto;
import com.example.currencyapi.model.Currency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService{
    @Override
    public List<Currency> getAllCurrencies() {
        return null;
    }

    @Override
    public Currency getCurrencyById(Long id) {
        return null;
    }

    @Override
    public Currency addCurrency(CurrencyDto currency) {
        return null;
    }

    @Override
    public Currency updateCurrency(Long id, Currency currency) {
        return null;
    }

    @Override
    public void deleteCurrency(Long id) {

    }
}
