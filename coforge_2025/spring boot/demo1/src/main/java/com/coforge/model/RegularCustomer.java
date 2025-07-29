package com.coforge.model;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component(value = "rcustomer")
public class RegularCustomer extends  Customer {

    @Override
    public void customerInfo() {
        System.out.println("Regular Customer ");
    }
    @PostConstruct
    public void init(){
        System.out.println("regular init called");
     this.setId(76767676);
     this.setName("mithlesh kumar");
     this.setSalary(35000.0f);
    }
}
