package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.IGreetingService;

// Least Optimal Way of Dependency Injection
public class PropertyInjectedController {

    IGreetingService iGreetingService;

    public String sayHello() {
        return iGreetingService.sayGreeting();
    }
}
