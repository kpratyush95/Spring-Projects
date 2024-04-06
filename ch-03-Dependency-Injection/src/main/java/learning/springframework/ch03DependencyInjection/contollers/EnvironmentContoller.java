package learning.springframework.ch03DependencyInjection.contollers;

import learning.springframework.ch03DependencyInjection.services.IEnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentContoller {

    private final IEnvironmentService iEnvironmentService;


    public EnvironmentContoller(IEnvironmentService iEnvironmentService) {
        this.iEnvironmentService = iEnvironmentService;
    }

    public  String getEnvironment(){
        return "Hello from the "+ iEnvironmentService.getEnv()+" environment";
    }
}
