package learning.springframework.ch03DependencyInjection.services.i18N;

import learning.springframework.ch03DependencyInjection.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
