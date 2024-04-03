package learning.springframework.ch03DependencyInjection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Hi I'm setting a Greeting";
    }
}
