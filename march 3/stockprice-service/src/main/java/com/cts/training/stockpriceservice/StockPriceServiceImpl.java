package com.cts.training.stockpriceservice;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StockPriceServiceImpl  implements StockPriceService{
	
	@Autowired
	StockPriceRepo stockpriceRepo;
	@Override
	public StockPriceDTO insert(StockPriceDTO stockpriceDTO) {
		StockPrice stockprice = new StockPrice();
		BeanUtils.copyProperties(stockpriceDTO,stockprice);
		stockpriceRepo.save(stockprice);
		return stockpriceDTO;


}
	@Override
	public List<StockPriceDTO> getAllStockPrices() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StockPriceDTO getStockPriceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StockPriceDTO saveStockPrice(StockPriceDTO stockprice) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteStockPrice(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public StockPriceDTO updateStockPrice(StockPriceDTO stockprice) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean activateStockPrice(String email) {
		// TODO Auto-generated method stub
		return false;
	}
}