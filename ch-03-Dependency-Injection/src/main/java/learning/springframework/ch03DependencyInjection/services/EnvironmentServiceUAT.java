package learning.springframework.ch03DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class EnvironmentServiceUAT implements IEnvironmentService {
    @Override
    public String getEnv() {
        return "UAT";
    }
}
