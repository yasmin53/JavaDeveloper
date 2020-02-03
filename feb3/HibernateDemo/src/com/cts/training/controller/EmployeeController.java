package com.cts.training.controller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;
public class EmployeeController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Malavika");
		
		
		PermanentEmployee pe=new PermanentEmployee();
		pe.setSalary(548736);
		pe.setBonus(749875F);
		
		
		ContractualEmployee ce=new ContractualEmployee();
		ce.setPayPerHour(8375);
		ce.setContractPeriod(12);
		session.save(pe);
		session.save(ce);
		
		
		session.save(employee);		
		tx.commit();
		session.close();
	}
}