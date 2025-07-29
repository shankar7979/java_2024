package com.coforge.model;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "scustomer")
@Primary
public class SpecialCustomer extends Customer {

    @Override
    public void customerInfo() {
        System.out.println("Special Customer ");
    }

    @PostConstruct
    public void init() {
        System.out.println("special init called");
        this.setId(76767671);
        this.setName("saumesh kumar");
        this.setSalary(39000.0f);
    }
}
