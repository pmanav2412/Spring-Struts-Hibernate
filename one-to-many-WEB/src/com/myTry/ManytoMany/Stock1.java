package com.myTry.ManytoMany;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.myTry.OneToMany.StockDetails;

@Entity
@Table(name="Stock")
public class Stock1{
	
	@Id
	@GeneratedValue
	private Integer stockId;
	
	@Column(name="Stock_Id")
	private String stockCode;
	
	@Column(name="Stock_Name")
	private String stockName;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="Stock_Record",
	            joinColumns= {@JoinColumn(name="Stock_Id")},
	            inverseJoinColumns= {@JoinColumn(name="Record_Id")})
	private List<StockDetails1> stockDailyRecords = new ArrayList<StockDetails1>(
			0);
	
	
	
	/**
	 * @param stockCode
	 * @param stockName
	 */
	public Stock1(String stockCode, String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		
	}
	
	
	
	public List<StockDetails1> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(List<StockDetails1> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	
	
	
	
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	

}

