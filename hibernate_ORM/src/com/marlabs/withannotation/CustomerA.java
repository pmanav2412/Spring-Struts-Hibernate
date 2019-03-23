package com.marlabs.withannotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerA {
	
	@Id
	@GeneratedValue
	@Column(name="CustomerID")
	private int Customerid;
	
	
	@Column(name = "CustomerName", nullable = false)
	private String CustomerName;
	
	@Column(name="CustomerEmail")
	private String CustomerEmail;
	
	@Column(name="CustomerCity")
	private String CustomerCity;



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
