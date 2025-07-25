package com.coforge;

import com.coforge.config.UserConfiguration;
import com.coforge.model.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext
                context = new
                AnnotationConfigApplicationContext(Customer.class);

        Customer c = context.getBean(Customer.class);
        System.out.println(c);
    }
}
