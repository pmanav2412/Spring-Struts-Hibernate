package com.marlabs.model;

public class Customer {
	private int Customerid;
	private String CustomerName;
	private String CustomerEmail;
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
