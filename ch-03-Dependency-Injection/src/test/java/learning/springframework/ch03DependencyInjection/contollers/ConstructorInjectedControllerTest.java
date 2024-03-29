package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.GreetingService;
import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}