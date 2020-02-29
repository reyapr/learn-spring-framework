package reyapr.learn_beans.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From Constructor Service";
    }
}
