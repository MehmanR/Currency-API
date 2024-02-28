package com.example.currencyapi.service;

import com.example.currencyapi.model.Currency;
import com.example.currencyapi.model.ExchangeRate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService{
    @Override
    public List<ExchangeRate> getAllExchangeRates() {
        return null;
    }

    @Override
    public List<ExchangeRate> getExchangeRatesByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<ExchangeRate> getExchangeRatesByCurrency(Currency currency) {
        return null;
    }

    @Override
    public List<ExchangeRate> getExchangeRatesByDateAndCurrency(LocalDate date, Currency currency) {
        return null;
    }

    @Override
    public ExchangeRate addExchangeRate(ExchangeRate exchangeRate) {
        return null;
    }

    @Override
    public ExchangeRate updateExchangeRate(Long id, ExchangeRate exchangeRate) {
        return null;
    }

    @Override
    public void deleteExchangeRate(Long id) {

    }
}
