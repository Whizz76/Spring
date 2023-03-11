package spring.firstPrgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.firstPrgm.Cmp.GameRunner;

@SpringBootApplication
@ComponentScan("spring.firstPrgm.springBootPrgm")
// multiple component scans @ComponentScan({"",""})
// explicitly saying to scan in the mentioned package
public class FirstPrgmApplication {

	public static void main(String[] args) {


		SpringApplication.run(FirstPrgmApplication.class, args);
		//ConfigurableApplicationContext context
		// Spring first searches for components in package spring.firstprgm.Cmp and creates instances
		// of these i.e spring beans, after that it launches Application Context( Spring IOC container)
		// that takes in pojos or config files as input and creates its beans or manages the beans
		// created by spring
		//GameRunner runner=context.getBean(GameRunner.class);
		// Asking the context to provide the GameRunner Bean (Any object created and managed by spring)
		//runner.run();
	}

}
