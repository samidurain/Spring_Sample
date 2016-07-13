package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Setting constructor argument");
		this.customerRepository = customerRepository;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setting through set method");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
