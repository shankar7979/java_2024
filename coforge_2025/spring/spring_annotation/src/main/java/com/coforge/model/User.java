package com.coforge.model;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Data
public class User {
    private int userId;
    private String userName;
    private float userSalary;

    @PostConstruct
    public void init(){
        System.out.println("init called ");
        this.userId=878787;
        this.userName="veeresh kumar";
        this.userSalary=78000;
    }

    @PreDestroy
    public void close() {
        System.out.println("destroy called ");
    }

}
