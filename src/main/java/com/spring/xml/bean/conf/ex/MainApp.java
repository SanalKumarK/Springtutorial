package com.spring.xml.bean.conf.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kurunsk on 15-02-2016.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        SanalWorld sanalWorld = (SanalWorld) context.getBean("sanalWorld");

        System.out.println(obj.getMessage());

        System.out.println(sanalWorld.getFeeling());
    }
}
