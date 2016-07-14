import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;
import service.CustomerService;
import service.CustomerServiceImpl;

@Configuration
@ComponentScan
public class AppConfig {

	/*
	 * If we use @Repository @Service in corresponding classes, below code is
	 * not required.
	 * 
	 * @Bean(name = "customerService") public CustomerService
	 * getCustomerService() { CustomerServiceImpl customerService = new
	 * CustomerServiceImpl(); return customerService; }
	 * 
	 * @Bean(name="customerRepository") public CustomerRepository
	 * getCustomerRepository() { return new HibernateCustomerRepositoryImpl(); }
	 */
}
