package reyapr.learn_beans.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reyapr.learn_beans.services.GreetingService;

@Service
public class PropertyInjected {

    @Qualifier("propertyService")
    @Autowired
    private GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
