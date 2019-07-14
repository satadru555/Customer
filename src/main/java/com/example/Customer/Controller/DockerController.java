package com.example.Customer.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Customer;
import com.example.Customer.CustomerRepository;
import com.example.Customer.Service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@RestController

public class DockerController {


	@Autowired
	CustomerService customerService;


	@RequestMapping(value = "/createCustomer/{schoolname}", method = RequestMethod.GET)
	public String createCustomer(@PathVariable String schoolname) {		
			Customer customer = new Customer();
			customer.setName("RICKY");
			customer.setOrganization("ACCENTURE");
			customer.setState("WEST BENGAL");
			customer.setCountry("INDIA");		
			customerService.createCustomer(customer);;

	    return "Data inserted successfully";
	}
	
	
	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public List<Customer> getCustomer() {		
			System.out.println("GETUSER");	
			return customerService.getCustomers();

	  //  return "Data inserted successfully";
	}
	
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable long id) {		
			Customer customer = new Customer();
			customer.setName("TCS");
			customer.setOrganization("ACCENTURE");
			customer.setState("WEST BENGAL");
			customer.setCountry("INDIA");		
			customerService.update(customer, id);

	    return "Data updated successfully";
	}



}
