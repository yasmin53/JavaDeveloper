package com.cts.training.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
@Controller
public class UserController {
	@Autowired
	UserDAO userDAO;
	@GetMapping("/user-home")
	public String UserPage(Model model) {
		List<User> users = userDAO.getAllUsers();
		model.addAttribute("list", users);
		model.addAttribute("user", new User());
		return "manage-users";
	}
	@PostMapping("/user/save")
	// @RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {
		userDAO.saveOrUpdateUser(user);
		return "redirect:/user-home";
	}
	@GetMapping("/remove-user/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		User user = userDAO.getUserById(id);
		userDAO.deleteUser(user);
		return "redirect:/user-home";
	}
	@GetMapping("/update-user/{id}")
	public String updateUser(@PathVariable("id") int id, Model model) {
		User user = userDAO.getUserById(id);
		model.addAttribute("user", user);
		List<User> users = userDAO.getAllUsers();
		model.addAttribute("list", users);
		return "manage-users";
	}
	
	
	
	@GetMapping("/register-user")
	public String regUser() {
		return "register-user";
	}
	
	
}