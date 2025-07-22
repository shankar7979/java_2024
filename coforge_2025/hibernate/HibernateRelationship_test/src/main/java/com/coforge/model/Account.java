package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Account {
 @Id
 @GeneratedValue
 private int act_id;
 private  float balance;
 private String location;

 @OneToOne(cascade = CascadeType.ALL)
 private Customer customer;

}
