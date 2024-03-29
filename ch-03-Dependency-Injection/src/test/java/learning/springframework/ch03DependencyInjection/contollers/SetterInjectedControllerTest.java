package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setiGreetingService(new GreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}