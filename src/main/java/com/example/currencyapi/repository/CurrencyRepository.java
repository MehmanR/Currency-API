package com.example.currencyapi.repository;

import com.example.currencyapi.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {


}
