package com.myspring.repository;

import java.util.List;

import com.myspring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}