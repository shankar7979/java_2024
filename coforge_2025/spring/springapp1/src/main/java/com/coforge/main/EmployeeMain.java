package com.coforge.main;

import com.coforge.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        //BeanFactory
//         ApplicationContext
        ConfigurableApplicationContext
                beanFactory=new ClassPathXmlApplicationContext("beans.xml");
       Employee employee= beanFactory.getBean("employee",Employee.class);

        System.out.println(employee);

        Employee employee1= beanFactory.getBean("employee",Employee.class);

        employee1.setId(87878787);
        employee1.setName("prem kumar");
        employee1.setSalary(70000);
        System.out.println("employee1"+employee);
        System.out.println("employee2"+employee1);

        beanFactory.close();
    }
}
