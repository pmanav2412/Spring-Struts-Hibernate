package com.marlabs.withannotation;

public interface CustomerIN {
	public abstract void SaveCustomer(final CustomerA customer);

	public abstract void GetCustomer(final int customerId);

	public abstract void UpdateCustomer(final CustomerA customer);

	public abstract void DeleteCustomer(final CustomerA customer);

}
