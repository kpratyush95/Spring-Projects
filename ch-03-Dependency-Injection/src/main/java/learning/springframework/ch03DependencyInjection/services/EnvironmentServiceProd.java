package learning.springframework.ch03DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service
public class EnvironmentServiceProd implements IEnvironmentService {
    @Override
    public String getEnv() {
        return "Prod";
    }
}
