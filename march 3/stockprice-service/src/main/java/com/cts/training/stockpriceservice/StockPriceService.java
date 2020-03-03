package com.cts.training.stockpriceservice;

import java.util.List;



public interface StockPriceService {
	
	
	public List<StockPriceDTO> getAllStockPrices();
	public StockPriceDTO getStockPriceById(int id);
	public StockPriceDTO saveStockPrice(StockPriceDTO stockprice);
	public void deleteStockPrice(int id);
	public StockPriceDTO updateStockPrice(StockPriceDTO stockprice);
	public boolean activateStockPrice(String email);
	StockPriceDTO insert(StockPriceDTO stockpriceDTO);

}
