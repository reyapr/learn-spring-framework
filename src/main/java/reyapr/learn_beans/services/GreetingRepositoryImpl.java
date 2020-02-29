package reyapr.learn_beans.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String greetingFromId() {
        return "Dari Config Bro";
    }

    @Override
    public String greetingFromEn() {
        return "From Config Brother";
    }
}
