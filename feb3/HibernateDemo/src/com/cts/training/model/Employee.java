package com.cts.training.model;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="employee_Type",discriminatorType=DiscriminatorType.STRING,length=2)
//@DiscriminatorValue(value="EC")
@Inheritance(strategy=InheritanceType.JOINED)

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@ElementCollection(fetch=FetchType.LAZY)
	@CollectionTable(name="emails")
	private Set<String> emails;
	
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}










