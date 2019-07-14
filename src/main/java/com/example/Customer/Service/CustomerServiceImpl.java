package com.example.Customer.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Customer.Customer;
import com.example.Customer.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public void createCustomer(Customer customer) {
		
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>)customerRepository.findAll();
	}

	@Override
	public Customer update(Customer user, long l) {
		// TODO Auto-generated method stub
		return customerRepository.save(user);
	}

}
