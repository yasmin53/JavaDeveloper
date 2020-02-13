package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.cts.training.dao.EmployeeDAO;
import com.cts.training.model.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAOImpl");
		
//		//insertion
//		Employee employee=new Employee(2,"jerry",8898678976l,"jerry@gmail.com");
//		System.out.println(employeeDAO.saveEmployee(employee));
//		System.out.println(employeeDAO.getAllEmployees());
		
//		//delete
//		Employee employee=new Employee(2,"jerry",8898678976l,"jerry@gmail.com");
//		System.out.println(employeeDAO.deleteEmployee(employee));
//		
		
		//update
		Employee employee=new Employee(1,"harshitha",4567,"hari@gmail.com");
		System.out.println(employeeDAO.updateEmployee(employee));
		
		
		
	}
	}
	
	