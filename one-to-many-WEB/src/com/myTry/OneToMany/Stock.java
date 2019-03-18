package com.myTry.OneToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock {
	
	@Id
	@GeneratedValue
	private Integer stockId;
	
	@Column(name="Stock_Id")
	private String stockCode;
	
	@Column(name="Stock_Name")
	private String stockName;
	
	
	public Set<StockDetails> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(Set<StockDetails> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stock",cascade=CascadeType.ALL)
	private Set<StockDetails> stockDailyRecords = new HashSet<StockDetails>(
			0);
	
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
