package com.coforge.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Component
@Data
public class Customer {

    private int customerId;
    private  String  customerName;
    private LocalDate customerDob;

    @PostConstruct
    public void setUp(){
        this.customerId=988787;
        this.customerName="lalan kumar";
        this.customerDob=LocalDate.of(1993,11,12);
    }

}
