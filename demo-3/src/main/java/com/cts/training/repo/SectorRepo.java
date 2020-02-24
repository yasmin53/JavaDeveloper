package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.models.Sector;

public interface SectorRepo extends JpaRepository<Sector, Integer> {

}
