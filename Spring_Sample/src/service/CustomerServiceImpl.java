package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerRepository {
	private CustomerRepository custRepo = new CustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}

}
