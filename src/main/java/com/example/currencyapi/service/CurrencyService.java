package com.example.currencyapi.service;

import com.example.currencyapi.dto.CurrencyDto;
import com.example.currencyapi.model.Currency;

import java.util.List;

public interface CurrencyService {

    // Tüm para birimlerini getir
    List<Currency> getAllCurrencies();

    // Para birimi ID'sine göre para birimi getir
    Currency getCurrencyById(Long id);

    // Yeni bir para birimi ekle
    Currency addCurrency(CurrencyDto currency);

    // Para birimi güncelle
    Currency updateCurrency(Long id, Currency currency);

    // Para birimi sil
    void deleteCurrency(Long id);
}
