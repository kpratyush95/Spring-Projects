package learning.springframework.ch03DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Dev", "default"})
@Service
public class EnvironmentServiceDev implements IEnvironmentService {
    @Override
    public String getEnv() {
        return "Dev";
    }
}
