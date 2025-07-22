package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;


public class UserMain {
    public static void main(String[] args) {

        Session session
                = new Configuration().configure().buildSessionFactory().openSession();
        Account account = Account.builder().accountName("saving account").accountCreateDate(LocalDate.of(1997, 12, 15)).build();
        // User handles account -- unidirectional
        User user= User.builder().userName("suresh kumar").userDob(LocalDate.of(1995,11,29)).account(account).build();

        var tr=session.getTransaction();
        tr.begin();
        session.save(user);
        tr.commit();
    }
}
/*
  User  handles account -- unidirectional
  Account handles User, User handles Account -- bi directional

 */