package com.cts.training.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "companies")
@XmlRootElement

public class Company implements Serializable{

	private static final long serialVersionUID = -3774796956003475482L;
	@Id
//	@GeneratedValue
	private int id;
	private String companyname;
	private String ceo;
	private String boardOfDirector;
	private double turnover;
	private double noe;
	private String sector;
	
	public Company() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirector() {
		return boardOfDirector;
	}

	public void setBoardOfDirector(String boardOfDirector) {
		this.boardOfDirector = boardOfDirector;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public double getNoe() {
		return noe;
	}

	public void setNoe(double noe) {
		this.noe = noe;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyname=" + companyname + ", ceo=" + ceo + ", boardOfDirector="
				+ boardOfDirector + ", turnover=" + turnover + ", noe=" + noe + ", sector=" + sector + "]";
	}

	public Company(int id, String companyname, String ceo, String boardOfDirector, double turnover, double noe,
			String sector) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.ceo = ceo;
		this.boardOfDirector = boardOfDirector;
		this.turnover = turnover;
		this.noe = noe;
		this.sector = sector;
	}

	

	
	
	
	
}