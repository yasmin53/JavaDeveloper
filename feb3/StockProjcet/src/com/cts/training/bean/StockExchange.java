package com.cts.training.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StockMarket")
public class StockExchange implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6053165027002285797L;
	
	@Id
	@Column(name="stock_id")
	
	private int id;
	private String name;
	private String address;
	private String remarks;
	
	
	
	public StockExchange(int id, String name, String address, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.remarks = remarks;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	
	
}
