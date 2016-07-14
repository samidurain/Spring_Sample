import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import service.CustomerService;

/**
 * 
 * @author Samidurai.Nadarajan
 *
 */
public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService custService = appContext.getBean("customerService", CustomerService.class);
		System.out.println(custService.findAll().get(0));
	}
	
}
