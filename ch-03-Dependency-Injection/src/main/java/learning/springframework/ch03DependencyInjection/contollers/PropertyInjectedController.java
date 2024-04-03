package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Least Optimal Way of Dependency Injection
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    IGreetingService iGreetingService;

    public String sayHello() {
        return iGreetingService.sayGreeting();
    }
}
