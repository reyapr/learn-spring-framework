package reyapr.learn_beans.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nGreetingEn implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From i18n EN";
    }
}
