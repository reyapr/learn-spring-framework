package reyapr.learn_beans.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reyapr.learn_beans.services.GreetingService;

@Service
public class SetterInjected {

    private GreetingService greetingService;

    @Qualifier("setterService")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
