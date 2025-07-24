package com.coforge.main;

import com.coforge.model.Address;
import com.coforge.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

      Customer c1=  context.getBean("customer1", Customer.class);

        System.out.println(c1);

        System.out.println("Customer ");
        System.out.println("\tid : "+c1.getCustomerId());
 System.out.println("\tname : "+c1.getCustomerName());
System.out.println("\tsalary : "+c1.getCustomerSalary());

        System.out.println("\t Address");
        Address address=c1.getAddress();
        System.out.println("\t\taddr_id "+address.getAddr_id());
        System.out.println("\t\tlocation " + address.getLocation());
        System.out.println("\t\tcity " + address.getCity());

        System.out.println("bike list"+c1.getBikeList());
        System.out.println("mobile set"+c1.getMobileSet());
        System.out.println("state t"+c1.getStateMap());



    }
}
