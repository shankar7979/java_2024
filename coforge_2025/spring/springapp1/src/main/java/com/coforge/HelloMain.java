package com.coforge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

    public static void main(String[] args) {

        BeanFactory beanFactory;

        beanFactory=new ClassPathXmlApplicationContext("beans.xml");

       Hello h=(Hello) beanFactory.getBean("hello1");

       h.display();

    }
}
