//    package com.cts.training.middle.controller;
//	import java.util.List;
//	import javax.swing.text.html.FormSubmitEvent.MethodType;
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.stereotype.Controller;
//	import org.springframework.ui.Model;
//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.ModelAttribute;
//	import org.springframework.web.bind.annotation.PathVariable;
//	import org.springframework.web.bind.annotation.PostMapping;
//	import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.cts.training.bean.StockPrice;
//	
//	public class StockPriceController {
//		
//	@Controller
//	
//		@Autowired
//		StockPriceDAO stockPriceDAO;
//		@GetMapping("/stockPrice-home")
//		public String stockPricePage(Model model) {
//			List<StockPrice> stockPrice =stockPriceDAO.getAllStockPrice();
//			model.addAttribute("list", stockPrice);
//			model.addAttribute("stockPrice", new StockPrice());
//			StockPrice stockPrice = new StockPrice();
//			return "stockPrice";
//		}
//		@PostMapping("/stockPrice/save")
//		// @RequestMapping(value="/user/save",method=MethodType.POST)
//		public String addUser(@ModelAttribute("stockPrice") StockPrice stockPrice) {
//			stockPriceDAO.saveorUpdate(stockPrice);
//			return "redirect:/stockPrice-home";
//		}
//		@GetMapping("/remove/{id}")
//		public String deleteUser(@PathVariable("id") int id) {
//			StockPrice stockPrice = stockPriceDAO.getUserById(id);
//			stockPriceDAO.deleteUser(stockPrice);
//			return "redirect:/stockPrice-home";
//		}
//		@GetMapping("/update/{id}")
//		public String updateStockPrice(@PathVariable("id") int id,Model model) {
//			
//			User stockPrice=stockPriceDAO.getUserById(id);
//			model.addAttribute("user",user );
//			
//			return "users";
//			
//		}
//	}
//
//
//
//}
