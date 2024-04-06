package learning.springframework.ch03DependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class EnvironmentServiceQA implements IEnvironmentService {
    @Override
    public String getEnv() {
        return "QA";
    }
}
