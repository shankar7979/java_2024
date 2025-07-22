package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private  String  userName;
    private LocalDate userDob;

    @OneToOne(cascade = CascadeType.ALL)
   private  Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> prdSet;

}
