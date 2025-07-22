package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Customer {
 @Id
 @GeneratedValue
 private int id;
 private String name;
 private int age;

 @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
 private Account account;
}
