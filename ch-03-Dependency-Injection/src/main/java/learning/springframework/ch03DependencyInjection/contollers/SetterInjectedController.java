package learning.springframework.ch03DependencyInjection.contollers;


import learning.springframework.ch03DependencyInjection.services.IGreetingService;

//Next Preferred Way of Dependency Injection via Setter
public class SetterInjectedController {
    private IGreetingService iGreetingService;

    public void setiGreetingService(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
        return iGreetingService.sayGreeting();
    }
}
