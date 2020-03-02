package com.cts.training.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.training.models.IPO;

import com.cts.training.repo.IPORepo;
import com.cts.training.service.IPOService;

@Service
public class IPOServiceImpl implements IPOService {
	
	@Autowired
	IPORepo ipoRepo;
	@Override
	public IPODTO insert(IPODTO ipodto) {
		IPO ipo = new IPO();
		BeanUtils.copyProperties(ipodto,ipo);
		ipoRepo.save(ipo);
		return ipodto;
	}
	
	

}




