package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/emp")
    public String welcome(){
        return "empform";
    }

}
//http://localhost:8080/springmvcapp1/employee/emp