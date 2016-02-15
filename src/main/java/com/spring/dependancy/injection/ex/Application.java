package com.spring.dependancy.injection.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by kurunsk on 15-02-2016.
 */

@Configuration
@ComponentScan
public class Application {

    InitiHelloWorld initHloWorld = new InitiHelloWorld();

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!!!";
            }
        };
    }

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.printMessage();

        context.registerShutdownHook();
    }
}
