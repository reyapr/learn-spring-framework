package reyapr.learn_beans.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nGreetingId implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGreetingId(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.greetingFromId();
    }
}
