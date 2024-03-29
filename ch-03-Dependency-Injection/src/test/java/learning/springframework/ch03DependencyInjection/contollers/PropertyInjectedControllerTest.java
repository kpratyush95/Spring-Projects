package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.iGreetingService = new GreetingService();

    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}