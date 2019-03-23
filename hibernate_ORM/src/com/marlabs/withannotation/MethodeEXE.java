package com.marlabs.withannotation;

public class MethodeEXE {
	


	public static void main(String[] args) {
		System.out.println("Main Methode Starts................................");
	    save();
	    //CustomerIN getCustomer = new CustomerIMP();
	    //getCustomer.GetCustomer(1);
		//Update();
		//Delete();
		System.out.println("Main Methode Ends................................");

	}
	
	private static void save() {
		CustomerA customer = new CustomerA();
		// customer.setCustomerid(7);
		customer.setCustomerName("darshan");
	    customer.setCustomerCity("Bhroch");
		customer.setCustomerEmail("pmandvsav34@gmail.com");
		CustomerIN saveCustomer = new CustomerIMP();
		saveCustomer.SaveCustomer(customer);
	}
	
	private static void Update() {
		CustomerA customer = new CustomerA();
		//customer.setCustomerid(4);
	    customer.setCustomerName("manav");
	    customer.setCustomerCity("Bhroch");
	    customer.setCustomerEmail("pmanav34@gmail.com");
		CustomerIN saveCustomer = new CustomerIMP();
		saveCustomer.UpdateCustomer(customer);
	}
	
	private static void Delete() {
		CustomerA customer = new CustomerA();
//		customer.setCustomerid(2);
		CustomerIN saveCustomer = new CustomerIMP();
		saveCustomer.DeleteCustomer(customer);
	}
	
	

}
