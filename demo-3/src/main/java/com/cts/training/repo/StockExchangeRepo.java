package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.models.StockExchange;

public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer> {

}
