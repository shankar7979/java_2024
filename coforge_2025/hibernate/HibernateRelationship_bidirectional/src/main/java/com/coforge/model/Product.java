package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
public class Product {

    @Id
    @GeneratedValue
    private int prdId;
    private  String  prdName;
    private LocalDate mfd;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "prdSet")
    private Set<User> userSet;

}
