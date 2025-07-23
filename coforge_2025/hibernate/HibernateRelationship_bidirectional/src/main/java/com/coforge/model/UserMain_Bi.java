package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UserMain_Bi {
    public static void main(String[] args) {

        Session session
                = new Configuration().configure().buildSessionFactory().openSession();
        Account account = Account.builder().accountName("saving account").accountCreateDate(LocalDate.of(1997, 12, 15)).build();

        Product product[] = new Product[2];
        Product product1[] = new Product[2];
        product[0] = Product.builder().prdName("book").mfd(LocalDate.now()).build();
        product[1] = Product.builder().prdName("mobile").mfd(LocalDate.of(2022,11,22)).build();

        product1[0] = Product.builder().prdName("sweets").mfd(LocalDate.of(2025,5,30)).build();
        product1[1] = Product.builder().prdName("bucket").mfd(LocalDate.of(2025,1,12)).build();

        var prdset=Stream.of(product).collect(Collectors.toSet());
        var prdset1=Stream.of(product1).collect(Collectors.toSet());

        User user[]=new User[2];
        user[0] = User.builder().userName("suresh kumar").userDob(LocalDate.of(1995, 11, 29)).account(account).prdSet(prdset).build();
        user[1] = User.builder().userName("mahesh kumar").userDob(LocalDate.of(1991, 11, 22)).account(account).prdSet(prdset1).build();

        var tr = session.getTransaction();
        tr.begin();
        session.save(user[0]);
        session.save(user[1]);
        tr.commit();

        List<User> all = session.createNamedQuery("uall").list();
        Query all1 = session.createNamedQuery("uall1");
        all1.setParameter(1,1);
        List<User> all2=all1.list();
        System.out.println(all);
        System.out.println("all2"+all2);
    }
}
/*
  User  handles account -- unidirectional
  Account handles User, User handles Account -- bi directional

 */