package repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.Customer;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("ANIL");
		customer.setLastName("KUMAR");
		customers.add(customer);

		return customers;
	}

}
