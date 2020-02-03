package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")

public class PassportDetails {
	
	@Id
	@GeneratedValue
	
	private int id;
	private String passportNumber;
	
	@OneToOne
	private Person person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public void setPerson(Person person) {
		// TODO Auto-generated method stub
		
	}
	

	
}
