package reyapr.learn_beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import reyapr.learn_beans.controllers.*;

@SpringBootApplication
public class LearnBeansApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LearnBeansApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        ConstructorInjected constructorInjected  = (ConstructorInjected) ctx.getBean("constructorInjected");

        System.out.println(constructorInjected.sayGreeting());

        PropertyInjected propertyInjected = (PropertyInjected) ctx.getBean("propertyInjected");

        System.out.println(propertyInjected.sayGreeting());

        SetterInjected setterInjected = (SetterInjected) ctx.getBean("setterInjected");

        System.out.println(setterInjected.sayGreeting());
    }

}
