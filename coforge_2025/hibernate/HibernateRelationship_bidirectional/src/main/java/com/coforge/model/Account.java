package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
public class Account {
    @Id
    @GeneratedValue
    private int accountId;
    private  String  accountName;
    private LocalDate accountCreateDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private User user;


}
