package learning.springframework.ch03DependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from primary bean";
    }
}
