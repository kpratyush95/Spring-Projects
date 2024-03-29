package learning.springframework.ch03DependencyInjection.contollers;


import learning.springframework.ch03DependencyInjection.services.GreetingService;
import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final IGreetingService iGreetingService;

    public MyController() {
        this.iGreetingService = new GreetingService();
    }


    public String sayHello() {
        System.out.println("I'm in the Controller");

        return iGreetingService.sayGreeting();
    }
}
