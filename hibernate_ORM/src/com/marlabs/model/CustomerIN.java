package com.marlabs.model;

public interface CustomerIN {
  public abstract void SaveCustomer(final Customer customer);
  
  public abstract void GetCustomer(final int customerId);
  
  public abstract void UpdateCustomer(final Customer customer);
  
  public abstract void DeleteCustomer(final Customer customer);
  
}
