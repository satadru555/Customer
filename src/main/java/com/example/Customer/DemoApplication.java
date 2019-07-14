package com.example.Customer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

//@EnableJpaRepositories(basePackages = {"com.example.Customer"})
//@EnableJpaRepositories(basePackages = {"com.springbootdev.domain.repository"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	 

}
