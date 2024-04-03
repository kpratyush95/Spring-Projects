package learning.springframework.ch03DependencyInjection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements IGreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do Property Injection!!!";
    }
}
