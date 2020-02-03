

package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.StockExchange;

public interface StockExchangeDAO {

	public boolean saveStockExchange(StockExchange stockexchange);

	public boolean updateStockExchange(StockExchange stockexchange);

	public boolean daleteStockExchange(StockExchange stockexchange);

	public StockExchange getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchanges();
}
