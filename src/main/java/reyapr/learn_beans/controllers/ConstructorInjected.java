package reyapr.learn_beans.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import reyapr.learn_beans.services.GreetingService;

@Controller
public class ConstructorInjected {

    private GreetingService greetingService;

    public ConstructorInjected(@Qualifier("constructorService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
