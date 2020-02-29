package reyapr.learn_beans.services;


public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreatingService(String lang){
        switch (lang){
            case "en":
                return new I18nGreetingEn(greetingRepository);
            default:
                return new I18nGreetingId(greetingRepository);
        }
    }
}
