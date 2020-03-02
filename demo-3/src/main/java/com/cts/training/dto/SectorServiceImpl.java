package com.cts.training.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.models.Sector;
import com.cts.training.repo.SectorRepo;
import com.cts.training.service.SectorService;
@Service

public class SectorServiceImpl implements SectorService{

	@Autowired
	SectorRepo sectorRepo;
	@Override
	public SectorDTO insert(SectorDTO sectorDTO) {
		Sector sector = new Sector();
		BeanUtils.copyProperties(sectorDTO,sector);
		sectorRepo.save(sector);
		return sectorDTO;
	}
	

}
