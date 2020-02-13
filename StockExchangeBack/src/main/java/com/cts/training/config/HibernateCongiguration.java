package com.cts.training.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.cts.training")
public class HibernateCongiguration {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sessionFactory =new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[]{"com.cts.training.bean"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
		}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/cts?autoReconnect=true&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		return dataSource;
	}
	
	
	private Properties hibernateProperties() {
		Properties properties=new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.show_sql",true);
		properties.put("hibernate.format_sql",true);
		properties.put("hibernate.hbm2ddl.auto","update");
		
		
		return properties;
	}
	
@Bean

public HibernateTransactionManager transactionManager(SessionFactory s)
{
	HibernateTransactionManager txManager=new HibernateTransactionManager();
	txManager.setSessionFactory(s);
	return txManager;
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
