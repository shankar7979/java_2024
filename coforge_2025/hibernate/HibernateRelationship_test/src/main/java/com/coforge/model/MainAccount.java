package com.coforge.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAccount {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().
                configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.getTransaction();

        Customer customer = Customer.builder().name("ram").age(20).build();
        Account account = Account.builder().balance(20000).location("delhi").customer(customer).build();
        customer.setAccount(account);

        transaction.begin();
        // from account side handles customer
        session.save(account);
        transaction.commit();
    }
}
