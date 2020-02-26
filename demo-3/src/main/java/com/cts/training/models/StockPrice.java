package com.cts.training.models;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "stockprices")
@XmlRootElement
public class StockPrice implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 6893738367295298635L;
	@Id
//	@GeneratedValue
	private int id;
	private int companyid;
	private double currentprice;
	private LocalDateTime opendatetime;
	public StockPrice() {
	}
	public StockPrice(int id, int companyid, double currentprice, LocalDateTime opendatetime) {
		super();
		this.id = id;
		this.companyid = companyid;
		this.currentprice = currentprice;
		this.opendatetime = opendatetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public double getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(double currentprice) {
		this.currentprice = currentprice;
	}
	public LocalDateTime getOpendatetime() {
		return opendatetime;
	}
	public void setOpendatetime(LocalDateTime opendatetime) {
		this.opendatetime = opendatetime;
	}
	@Override
	public String toString() {
		return "StockPrice [id=" + id + ", companyid=" + companyid + ", currentprice=" + currentprice
				+ ", opendatetime=" + opendatetime + "]";
	}
	}













