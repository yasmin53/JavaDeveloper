package com.cts.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.models.IPO;

public interface IPORepo extends JpaRepository<IPO, Integer> {

}
