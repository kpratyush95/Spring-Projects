package learning.springframework.ch03DependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }
}
