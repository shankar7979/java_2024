package com.coforge;

import com.coforge.model.Insurance;
import com.coforge.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceMain //implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(InsuranceMain.class,args);
    }
//
//    @Autowired
//    private InsuranceService service;
//    @Override
//    public void run(String... args) throws Exception {
//        Insurance insurance=new Insurance();
//        insurance.setName("car insurance");
//        insurance.setSalary(30000);
//        service.addInsurance(insurance);
//
//        service.getAllInsurance().forEach(System.out::println);
//
//    }
}
