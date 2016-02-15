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

        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");

        System.out.println(obj.getMessage());

        System.out.println(sanalWorld.getFeeling());

        System.out.println(javaCollection.getList());

        System.out.println(javaCollection.getSet());

        System.out.println(javaCollection.getAddMap());

        System.out.println(javaCollection.getProps());
    }
}
