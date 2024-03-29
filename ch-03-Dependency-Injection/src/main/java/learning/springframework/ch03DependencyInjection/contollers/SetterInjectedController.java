package learning.springframework.ch03DependencyInjection.contollers;


import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Next Preferred Way of Dependency Injection via Setter
@Controller
public class SetterInjectedController {
    private IGreetingService iGreetingService;

    @Autowired
    public void setIGreetingService(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
        return iGreetingService.sayGreeting();
    }
}
