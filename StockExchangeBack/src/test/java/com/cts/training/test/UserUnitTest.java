package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.daoimpl.UserDAOImpl;

public class UserUnitTest {
	
	
	private static  AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private static User user;
	
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user =(User) context.getBean("user");
		userDAO =new UserDAOImpl();
		
	}
	

	@Test
	public void testGetAllUsers() {
		List<User> users=userDAO.getAllUsers();
		assertEquals(1,users.size());
		
		fail("Not yet implemented");
	}

}
