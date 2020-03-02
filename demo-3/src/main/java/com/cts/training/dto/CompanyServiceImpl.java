package com.cts.training.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.models.Company;
import com.cts.training.repo.CompanyRepo;
import com.cts.training.service.CompanyService;


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





