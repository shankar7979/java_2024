package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainCustomer {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().
                configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.getTransaction();

        Account account = Account.builder().balance(20000).location("delhi").build();
        Customer customer = Customer.builder().name("ram").age(20).account(account).build();
        account.setCustomer(customer);

        transaction.begin();
        // from customer side handles account
        session.save(customer);
        transaction.commit();


    }
}
