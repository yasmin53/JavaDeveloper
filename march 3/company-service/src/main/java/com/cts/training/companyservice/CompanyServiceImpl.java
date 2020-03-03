package com.cts.training.companyservice;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepo companyRepo;
	@Override
	public CompanyDTO insert(CompanyDTO companyDTO) {
		Company company = new Company();
		BeanUtils.copyProperties(companyDTO,company);
		companyRepo.save(company);
		return companyDTO;
	}
	@Override
	public List<CompanyDTO> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CompanyDTO getCompanyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CompanyDTO saveCompany(CompanyDTO company) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteCompany(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CompanyDTO updateCompany(CompanyDTO company) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean activateCompany(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}





