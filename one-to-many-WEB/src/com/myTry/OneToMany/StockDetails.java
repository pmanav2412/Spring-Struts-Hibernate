package com.myTry.OneToMany;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stock_Details")
public class StockDetails {
	
	
	@Id
	@Column(name="Record_Id")
	private Integer recordId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STOCK_ID", nullable = false)
	private Stock stock;
	
	@Column(name="PRICE_OPEN")
	private Float priceOpen;
	
	@Column(name="PRICE_CLOSE")
	private Float priceClose;
	
	@Column(name="PRICECHANGE")
	private Float priceChange;
	
	@Column(name="VOLUME")
	private Long volume;
	
	@Column(name="CreateOn")
	private String date;

	
	public StockDetails() {
		
	}
	
	/**
	 * @param recordId
	 * @param priceOpen
	 * @param priceClose
	 * @param priceChange
	 * @param volume
	 * @param date
	 */
	public StockDetails(Integer recordId, Float priceOpen, Float priceClose, Float priceChange, Long volume,
			String date) {
		this.recordId = recordId;
		this.priceOpen = priceOpen;
		this.priceClose = priceClose;
		this.priceChange = priceChange;
		this.volume = volume;
		this.date = date;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Float getPriceOpen() {
		return priceOpen;
	}

	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}

	public Float getPriceClose() {
		return priceClose;
	}

	public void setPriceClose(Float priceClose) {
		this.priceClose = priceClose;
	}

	public Float getPriceChange() {
		return priceChange;
	}

	public void setPriceChange(Float priceChange) {
		this.priceChange = priceChange;
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
