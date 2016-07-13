package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository custRepo = new CustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}

}
