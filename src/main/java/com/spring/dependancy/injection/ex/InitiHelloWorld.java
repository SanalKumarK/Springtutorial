package com.spring.dependancy.injection.ex;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by kurunsk on 15-02-2016.
 */
public class InitiHelloWorld implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization - " + beanName);
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean , String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization - " + beanName);
        return bean;
    }
}
