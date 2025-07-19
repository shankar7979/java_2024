package com.coforge.model.com.coforge.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    static SessionFactory sessionFactory;
    Configuration configuration;

    public static  SessionFactory mysessionFactory(){
        configuration=new Configuration();
        if(sessionFactory==null){
            sessionFactory=configuration.buildSessionFactory();
        }
        return  sessionFactory;
    }
}
