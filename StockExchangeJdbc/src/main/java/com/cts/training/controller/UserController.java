package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.dao.UserEntity;

public class UserController {
	
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("./bean.xml");
		UserEntity userDAO=(UserEntity) context.getBean("UserDAOImpl");
		//Insertion
		
		UserEntity user=new UserEntity(1,"Yasmin","zubduma@gmail.com",5676789L);
		System.out.println(UserEntity.addUserEntity(user));
		
		
		System.out.println(UserEntity.getAllUsers(user));
		
	}

}
