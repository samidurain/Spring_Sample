package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Customer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository custRepo = new HibernateCustomerRepositoryImpl();

	public CustomerServiceImpl() {

	}

	//@Autowired
	public CustomerServiceImpl(CustomerRepository custRepo) {
		System.out.println("We are using constructor Injection");
		this.custRepo = custRepo;
	}

	@Autowired
	public void setCustRepo(CustomerRepository custRepo) {
		System.out.println("We are using Setter Injection");
		this.custRepo = custRepo;
	}

	@Override
	public List<Customer> findAll() {
		return custRepo.findAll();
	}

}
