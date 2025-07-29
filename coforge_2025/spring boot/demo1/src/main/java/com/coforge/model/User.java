package com.coforge.model;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {

    private int id;
    private String name;
    private float salary;

    @PostConstruct
    public void start(){
        this.id=898987;
        this.name="suresh kumar";
        this.salary=67000;
    }

}
