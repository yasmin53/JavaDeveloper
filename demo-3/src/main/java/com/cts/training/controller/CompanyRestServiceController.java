package com.cts.training.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cts.training.models.Company;
import com.cts.training.repo.CompanyRepo;
@CrossOrigin(origins = "*")
@RestController
public class CompanyRestServiceController {
	@Autowired
	CompanyRepo cr;
	@GetMapping("/companies")
	public List<Company> findAll() {
		return cr.findAll();
	}
	@GetMapping("/companies/{id}")
	public Company findOne(@PathVariable int id) {
		Optional<Company> csr = cr.findById(id);
		Company cs = csr.get();
		return cs;
	}
	@PostMapping("/companies")
	public Company save(@RequestBody Company csr) {
		Company cs = cr.save(csr);
		return cs;
	}
	@DeleteMapping("/companies/{id}")
	public void delete(@PathVariable int id) {
		cr.deleteById(id);
	}
	@PutMapping("/companies")
	public Company update(@RequestBody Company csr) {
		Company cs = cr.save(csr);
		return cs;
	}
}