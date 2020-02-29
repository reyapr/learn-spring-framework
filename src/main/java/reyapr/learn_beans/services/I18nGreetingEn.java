package reyapr.learn_beans.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nGreetingEn implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGreetingEn(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.greetingFromEn();
    }
}
