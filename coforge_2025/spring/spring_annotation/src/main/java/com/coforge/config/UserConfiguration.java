package com.coforge.config;

import com.coforge.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfiguration {

    @Bean
    @Scope(scopeName = "prototype")
    public User userBean(){
        User user=new User();
        user.setUserId(67767676);
        user.setUserName("vishwa dasha");
        user.setUserSalary(45000.04f);
        return  user;
    }

}
