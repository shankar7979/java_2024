package com.coforge.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public abstract class Customer {
 private int id;
 private  String name;
 private  float salary;

 public abstract void customerInfo();

}
