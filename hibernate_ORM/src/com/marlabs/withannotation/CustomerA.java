package com.marlabs.withannotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Customer")
public class CustomerA {
	
	@Id
	@GenericGenerator(name="increment", strategy="increment")
	@Column(name="CustomerID")
	private int Customerid;
	
	
	@Column(name="CustomerName", nullable=false, length=10)
	private String CustomerName;
	
	@Column(name="CustomerEmail")
	private String CustomerEmail;
	
	@Column(name="CustomerCity")
	private String CustomerCity;

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerCity() {
		return CustomerCity;
	}

	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}

	@Override
	public String toString() {
		return String.format("Customer [Customerid=%s, CustomerName=%s, CustomerEmail=%s, CustomerCity=%s]", Customerid,
				CustomerName, CustomerEmail, CustomerCity);
	}

}
