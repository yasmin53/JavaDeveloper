package com.cts.training.controller;
import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.daoimpl.UserDAOImpl;
public class UserController {
	public static void main(String[] args) {
		User user = new User(106, "Yasmin", "467365", "yasmin@cts.com", 95794567L, false);
		UserDAO userDAO = new UserDAOImpl();
//Saving User
//		boolean status = userDAO.saveUser(user);
//		if (status) {
//			System.out.println("user Saved Successfully");
//		} else {
//			System.out.println("Try Again");
		}
		boolean status = UserDAO.isValidUser("harshitha","12345");
		if(status)
		{
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User");
		}
			
		}
		
		
//Updating User
//		User getUser=userDAO.getUserById(104);
//		getUser.setEmail("akhilBharadwaj@gmail.com");
//		boolean status = userDAO.updateUser(user);
//		if (status) {
//			System.out.println("user updated Successfully");
//		} else {
//			System.out.println("Try Again");
//		}
}
//}