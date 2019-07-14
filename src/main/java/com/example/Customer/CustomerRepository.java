package com.example.Customer;

import java.util.List;

import  org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String>{
	
}
