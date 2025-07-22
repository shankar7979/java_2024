package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class AccountMain {
    public static void main(String[] args) {
        Session session
                = new Configuration().configure().buildSessionFactory().openSession();

        var tr=session.getTransaction();

        User user=User.builder().userName("amit kumar").userDob(LocalDate.of(1988,12,30)).build();

        //Account handles  user -- bi-directional
        Account account=Account.builder().accountName("demate account").accountCreateDate(LocalDate.now()).user(user).build();
        user.setAccount(account);

        tr.begin();
        session.save(account);
        tr.commit();

    }
}
