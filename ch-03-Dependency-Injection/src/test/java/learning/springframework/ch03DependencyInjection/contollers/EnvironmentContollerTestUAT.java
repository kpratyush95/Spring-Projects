package learning.springframework.ch03DependencyInjection.contollers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("UAT")
@SpringBootTest
class EnvironmentContollerTestUAT {

    @Autowired
    EnvironmentContoller environmentContoller;
    @Test
    void getEnvironment() {
        System.out.println(environmentContoller.getEnvironment());
    }
}