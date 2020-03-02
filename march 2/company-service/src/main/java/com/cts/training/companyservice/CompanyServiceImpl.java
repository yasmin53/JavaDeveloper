package com.cts.training.companyservice;

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
	
	

}





