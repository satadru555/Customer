package com.example.Customer.Service;



import java.util.List;

import com.example.Customer.Customer;



public interface CustomerService {

	public void createCustomer(Customer customer);
	public List<Customer> getCustomers();
	public Customer update(Customer user, long l);
}
