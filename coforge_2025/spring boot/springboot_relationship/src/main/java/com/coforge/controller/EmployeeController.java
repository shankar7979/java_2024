package com.coforge.controller;

import com.coforge.exception.EmployeeException;
import com.coforge.model.Employee;
import com.coforge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        try {
            return  service.getAllEmployee();
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody  Employee emp) {
        try {
            return service.addEmployee(emp);
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }
     }
    }
