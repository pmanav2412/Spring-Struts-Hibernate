package com.marlabs.model;

public class MethodeEXE {
	


	public static void main(String[] args) {
		System.out.println("Main Methode Starts................................");
		save();
	    //CustomerIN getCustomer = new CustomerIMP();
	    //getCustomer.GetCustomer(1);
		//Update();
		// Delete();
		System.out.println("Main Methode Ends................................");

	}  
	
	private static void save() {
		Customer customer = new Customer();
	    customer.setCustomerName("Darshit");
	    customer.setCustomerCity("Hurat");
	    customer.setCustomerEmail("djpatel1234@gmail.com");
		CustomerIN saveCustomer = new CustomerIMP();
		saveCustomer.SaveCustomer(customer);
	}
	
	private static void Update() {
		Customer customer = new Customer();
		customer.setCustomerid(4);
	    customer.setCustomerName("Darshit");
	    customer.setCustomerCity("Surat");
	    customer.setCustomerEmail("djpooja1234@gmail.com");
		CustomerIN updateCustomer = new CustomerIMP();
		updateCustomer.UpdateCustomer(customer);
	}
	
	private static void Delete() {
		Customer customer = new Customer();
		customer.setCustomerid(1);
		CustomerIN dltCustomer = new CustomerIMP();
		dltCustomer.DeleteCustomer(customer);
	}
	
	

}
