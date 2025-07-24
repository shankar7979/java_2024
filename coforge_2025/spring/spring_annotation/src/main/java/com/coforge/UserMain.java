package com.coforge;

import com.coforge.config.UserConfiguration;
import com.coforge.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        //ApplicationContext
          ConfigurableApplicationContext
                context=new AnnotationConfigApplicationContext(UserConfiguration.class);

      User user=  context.getBean(User.class);
        System.out.println(user);

        User user1=  context.getBean("userBean",User.class);
        user1.setUserId(1);
        user1.setUserName("vaibhav gupta");

        user1.setUserSalary(560000);

        System.out.println(user);
        System.out.println(user1);


  context.close();
    }
}
