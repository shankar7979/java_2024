package com.example.demo1;

import com.coforge.model.Customer;
import com.coforge.model.Employee;
import com.coforge.model.User;
import com.coforge.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.coforge.model","com.coforge.service"})
public class Demo1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);
       CustomerService service=  ctx.getBean(CustomerService.class);
      Customer c=service.getCustomer();
        System.out.println(c);



//        Employee emp = ctx.getBean(Employee.class);
//        System.out.println(emp);
//
//       User u= ctx.getBean(User.class);
//        System.out.println(u);


    }

}
