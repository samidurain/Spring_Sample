package repository;

import java.util.List;

import model.Customer;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
public interface CustomerRepository {
	public List<Customer> findAll();
}
