package com.coforge.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {
   private int id;
   private  String name;
   private  float cost;
}
