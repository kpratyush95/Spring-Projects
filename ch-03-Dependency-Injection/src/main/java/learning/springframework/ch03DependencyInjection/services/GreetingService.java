package learning.springframework.ch03DependencyInjection.services;

public class GreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }
}
