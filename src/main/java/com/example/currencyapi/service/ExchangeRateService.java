package com.example.currencyapi.service;

import com.example.currencyapi.model.Currency;
import com.example.currencyapi.model.ExchangeRate;

import java.time.LocalDate;
import java.util.List;

public interface ExchangeRateService {

        // Tüm döviz kurlarını getir
        List<ExchangeRate> getAllExchangeRates();

        // Belirli bir tarihte geçerli olan döviz kurlarını getir
        List<ExchangeRate> getExchangeRatesByDate(LocalDate date);

        // Belirli bir para birimine ait tüm döviz kurlarını getir
        List<ExchangeRate> getExchangeRatesByCurrency(Currency currency);

        // Belirli bir tarihte ve para birimine ait döviz kurlarını getir
        List<ExchangeRate> getExchangeRatesByDateAndCurrency(LocalDate date, Currency currency);

        // Yeni bir döviz kuru ekle
        ExchangeRate addExchangeRate(ExchangeRate exchangeRate);

        // Döviz kuru güncelle
        ExchangeRate updateExchangeRate(Long id, ExchangeRate exchangeRate);

        // Döviz kuru sil
        void deleteExchangeRate(Long id);


}
