package com.coforge.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/welcome")
    public String welcome(){
        return  "hello world";
    }

}
//http://localhost:8080/hello/welcome