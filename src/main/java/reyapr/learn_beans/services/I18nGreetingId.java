package reyapr.learn_beans.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ID", "default"})
@Service("i18nService")
public class I18nGreetingId implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Halo dari i18n ID";
    }
}
