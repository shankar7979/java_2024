package com.coforge;

import com.coforge.model.Address;
import com.coforge.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class CustomerMain {

    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Session session= sessionFactory.openSession();
        Customer customer=new Customer();

        Address address=new Address();
        address.setCity("new delhi");
        address.setState("delhi");

        customer.setName("hari kumar");
        customer.setDob(LocalDate.of(1998,11,11));

        customer.setAddress(address);
        session.beginTransaction();

        session.save(address);
        session.save(customer);
        session.getTransaction().commit();


        session.createQuery("from Customer").list().forEach(System.out::println);


    }
}
