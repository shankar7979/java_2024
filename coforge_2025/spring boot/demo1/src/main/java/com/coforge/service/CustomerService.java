package com.coforge.service;

import com.coforge.model.Customer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Data
public class CustomerService {

    @Autowired
    //@Qualifier("scustomer")
   // @Qualifier("rcustomer")
    private Customer customer;

}
