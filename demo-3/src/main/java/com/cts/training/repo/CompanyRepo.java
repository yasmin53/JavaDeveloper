package com.cts.training.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.training.models.Company;
public interface CompanyRepo extends JpaRepository<Company, Integer> {
}