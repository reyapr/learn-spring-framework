package reyapr.learn_beans.controllers;

import org.springframework.stereotype.Controller;
import reyapr.learn_beans.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
