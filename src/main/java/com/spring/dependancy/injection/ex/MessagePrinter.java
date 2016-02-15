package com.spring.dependancy.injection.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kurunsk on 15-02-2016.
 */
@Component
public class MessagePrinter implements InitializingBean, DisposableBean {

    final private MessageService messageService;

    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("init Set");
    }

    public void destroy() throws Exception {
        System.out.println("destroy Set");
    }
}
