package com.myspring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myspring.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Bryan");
		customer.setLastname("Hansen");
		
		customers.add(customer);
		
		return customers;
		
	}

}
