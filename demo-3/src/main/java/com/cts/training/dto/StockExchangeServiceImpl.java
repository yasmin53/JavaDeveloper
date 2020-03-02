package com.cts.training.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.models.StockExchange;
import com.cts.training.repo.StockExchangeRepo;
import com.cts.training.service.StockExchangeService;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {
	
	@Autowired
	StockExchangeRepo stockexchangeRepo;
	@Override
	public StockExchangeDTO insert(StockExchangeDTO stockexchangeDTO) {
		StockExchange stockexchange = new StockExchange();
		BeanUtils.copyProperties(stockexchangeDTO,stockexchange);
		stockexchangeRepo.save(stockexchange);
		return stockexchangeDTO;

}
}