package reyapr.learn_beans.controllers;

import org.springframework.stereotype.Controller;
import reyapr.learn_beans.services.GreetingService;

@Controller
public class ConstructorInjected {

    private GreetingService greetingService;

    public ConstructorInjected(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
