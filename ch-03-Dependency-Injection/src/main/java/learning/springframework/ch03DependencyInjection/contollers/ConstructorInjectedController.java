package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.springframework.stereotype.Controller;

//This is the most preferred way of Dependency Injection
@Controller
public class ConstructorInjectedController {

    private final IGreetingService iGreetingService;

    public ConstructorInjectedController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello() {
        return iGreetingService.sayGreeting();
    }
}
