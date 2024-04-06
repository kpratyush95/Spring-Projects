package learning.springframework.ch03DependencyInjection.contollers.i18N;

import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    private final IGreetingService iGreetingService;

    public Myi18NController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayHello(){
        return  iGreetingService.sayGreeting();
    }
}
