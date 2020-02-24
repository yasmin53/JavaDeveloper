package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.models.StockPrice;
import com.cts.training.repo.StockPriceRepo;



@CrossOrigin(origins = "*")
@RestController
public class StockPriceRestServiceController {
	
	@Autowired
	StockPriceRepo spr;
	
	@GetMapping("/stockprices")
	public List<StockPrice> findAll() {
		return spr.findAll();
	}
	
	@GetMapping("/stockprices/{id}")
	public StockPrice findOne(@PathVariable int id) {
		Optional<StockPrice> spsr = spr.findById(id);
		StockPrice sps = spsr.get();
		return sps;
	}
	
	@PostMapping("/stockprices")
	public StockPrice save(@RequestBody StockPrice spsr) {
		StockPrice sps = spr.save(spsr);
		return sps;
	}
	
	@DeleteMapping("/stockprices/{id}")
	public void delete(@PathVariable int id) {
		spr.deleteById(id);
	}
	
	@PutMapping("/stockprices")
	public StockPrice update(@RequestBody StockPrice spsr) {
		StockPrice sps = spr.save(spsr);
		return sps;
	}
}
