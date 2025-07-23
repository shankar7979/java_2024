package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UserMain {
    public static void main(String[] args) {

        Session session
                = new Configuration().configure().buildSessionFactory().openSession();
        Account account = Account.builder().accountName("saving account").accountCreateDate(LocalDate.of(1997, 12, 15)).build();
        // User handles account -- unidirectional

        Product product[] = new Product[4];
        product[0] = Product.builder().prdName("book").mfd(LocalDate.now()).build();
        product[1] = Product.builder().prdName("mobile").mfd(LocalDate.of(2022,11,22)).build();
        product[2] = Product.builder().prdName("sweets").mfd(LocalDate.of(2025,5,30)).build();
        product[3] = Product.builder().prdName("bucket").mfd(LocalDate.of(2025,1,12)).build();
        var prdset=Stream.of(product).collect(Collectors.toSet());

        User user = User.builder().userName("suresh kumar").userDob(LocalDate.of(1995, 11, 29)).account(account).prdSet(prdset).build();

        var tr = session.getTransaction();
        tr.begin();
        session.save(user);
        tr.commit();


    }
}
/*
  User  handles account -- unidirectional
  Account handles User, User handles Account -- bi directional

 */