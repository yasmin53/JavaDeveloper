package com.cts.training.daoimpl;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cts.training.bean.Company;

import com.cts.training.dao.CompanyDAO;
@Transactional
@Repository(value = "companyDAO")
public class CompanyDAOImpl implements CompanyDAO{
	SessionFactory sessionFactory;
	@Override
	public boolean saveCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().save(company);
			return true;
		}catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}
	@Override
	public boolean updateCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().update(company);
			return true;
		}catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}
	@Override
	public boolean removeCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().delete(company);
			return true;
		}catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}
	@Override
	public Company getCompanyById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Company.class,id);
		}catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Company> getAllCompanies() {
		try {
			List<Company> companies = sessionFactory.getCurrentSession().createQuery("from Company").list();
			return companies;
		}catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}
}