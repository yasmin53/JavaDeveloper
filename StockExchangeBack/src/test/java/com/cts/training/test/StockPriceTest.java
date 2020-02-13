package com.cts.training.test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.StockPrice;
import com.cts.training.bean.User;
import com.cts.training.dao.StockPriceDAO;
import com.cts.training.dao.UserDAO;

public class StockPriceTest {
	
	private static  AnnotationConfigApplicationContext context;
	private static StockPriceDAO stockPriceDAO;
	private static  StockPrice stockPrice;

	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		stockPrice =(StockPrice) context.getBean("stockPrice");
		stockPriceDAO =(StockPriceDAO) context.getBean("stockPriceDAO");

	}
	
//	@Test
//	public void test_save_user_success() {
//		stockPrice.setCompany_id(10100);
//		stockPrice.setCurrent_price(678687687);
//		stockPrice.setStock_exchange("Good");
//		stockPrice.setOpenDateTime(LocalDateTime.now());
//		assertEquals(true,stockPriceDAO.saveStockPrice(stockPrice));
//	}	
	@Test
	public void test_save_StockPrice() {
		StockPrice re=new StockPrice(2,"bse",873.57,LocalDateTime.now());
		assertEquals(true,stockPriceDAO.saveStockPrice(re));
	}
	
}
	
		
		
		

