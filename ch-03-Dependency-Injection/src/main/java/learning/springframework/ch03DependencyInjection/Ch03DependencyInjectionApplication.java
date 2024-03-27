package learning.springframework.ch03DependencyInjection;

import learning.springframework.ch03DependencyInjection.contollers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ch03DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Ch03DependencyInjectionApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In the Main method");
		System.out.println(controller.sayHello());
	}

}
