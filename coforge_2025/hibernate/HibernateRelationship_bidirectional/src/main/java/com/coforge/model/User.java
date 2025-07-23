package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Builder
@NamedQuery(name = "uall",query = "from User")
@NamedQuery(name = "uall1",query = "select u from User u where  u.userId=?1")
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
