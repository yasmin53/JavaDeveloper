package com.cts.training.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.models.StockExchange;
import com.cts.training.models.StockPrice;
import com.cts.training.repo.StockExchangeRepo;
import com.cts.training.repo.StockPriceRepo;
import com.cts.training.service.StockPriceService;
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
}