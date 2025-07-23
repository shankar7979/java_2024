package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ProductMain_Bi {
    public static void main(String[] args) {

        Session session
                = new Configuration().configure().buildSessionFactory().openSession();
        Account account = Account.builder().accountName("saving account").accountCreateDate(LocalDate.of(1997, 12, 15)).build();


        // product will handle user
        Product product[] = new Product[2];

        User user[] = new User[2];
        User user1[] = new User[2];

        user[0] = User.builder().userName("suresh kumar").userDob(LocalDate.of(1995, 11, 29)).account(account).build();
        user[1] = User.builder().userName("mahesh kumar").userDob(LocalDate.of(1991, 11, 22)).account(account).build();

        user1[0] = User.builder().userName("amit kumar").userDob(LocalDate.of(1999, 1, 29)).account(account).build();
        user1[1] = User.builder().userName("sumit kumar").userDob(LocalDate.of(1992, 12, 22)).account(account).build();

        var userset1=Stream.of(user).collect(Collectors.toSet());
        var userset2=Stream.of(user1).collect(Collectors.toSet());


        product[0] = Product.builder().prdName("book").mfd(LocalDate.now()).userSet(userset1).build();
        product[1] = Product.builder().prdName("mobile").mfd(LocalDate.of(2022, 11, 22)).userSet(userset2).build();

        var tr = session.getTransaction();
        tr.begin();
        session.save(product[0]);
        session.save(product[1]);
        tr.commit();


    }
}
/*
  User  handles account -- unidirectional
  Account handles User, User handles Account -- bi directional

 */