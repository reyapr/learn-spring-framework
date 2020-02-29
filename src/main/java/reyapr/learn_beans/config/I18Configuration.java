package reyapr.learn_beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import reyapr.learn_beans.services.GreetingRepository;
import reyapr.learn_beans.services.GreetingService;
import reyapr.learn_beans.services.GreetingServiceFactory;

@Configuration
public class I18Configuration {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Profile("EN")
    @Primary
    public GreetingService i18nGreetingEn(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreatingService("en");
    }

    @Bean
    @Profile({"ID", "default"})
    @Primary
    public GreetingService i18nGreetingId(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreatingService("id");
    }
}
