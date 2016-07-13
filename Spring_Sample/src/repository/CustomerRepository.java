package repository;

import java.util.List;

import model.Customer;

public interface CustomerRepository {
	public List<Customer> findAll();
}
