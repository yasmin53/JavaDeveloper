package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.models.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Integer> {

}
