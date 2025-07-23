package com.coforge.model;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    BeanFactory beanFactory;
    Employee employee1;
    Employee employee2;

    @BeforeEach
    public void setUp() {
        beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        employee1 = beanFactory.getBean("employee", Employee.class);
        employee2 = beanFactory.getBean("employee", Employee.class);
    }

    @Test
    public void testProperty() {
        assertNotNull(employee1);
        assertNotNull(employee2);
        assertEquals(employee1.getId(), 87878787);
        assertEquals(employee1.getName(), "suman kumar");
        assertEquals(employee1.getSalary(), 90000);
        //assertEquals(employee1,employee2);
        assertSame(employee1,employee2);
    }

}
