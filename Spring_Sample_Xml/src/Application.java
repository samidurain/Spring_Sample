import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
public class Application {

	public static void main(String[] args) {
		CustomerService custService = new CustomerServiceImpl();
		System.out.println(custService.findAll().get(0));
	}
	
}
