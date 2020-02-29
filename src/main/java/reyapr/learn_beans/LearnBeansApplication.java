package reyapr.learn_beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import reyapr.learn_beans.controllers.MyController;

@SpringBootApplication
public class LearnBeansApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LearnBeansApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

    }

}
