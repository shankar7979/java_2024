package com.coforge.service;

import com.coforge.dao.EmployeeRepository;
import com.coforge.exception.EmployeeException;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee addEmployee(Employee emp) throws EmployeeException {
        System.out.println(emp+" employee ");
//        if(repository.findById(emp.getId()).isEmpty()){
//            throw  new EmployeeException("employee object with given id already present ");
//        }
//        else {
         return    repository.save(emp);
        //}
    }

    public List<Employee> getAllEmployee() throws EmployeeException {
        if(repository.findAll().isEmpty()){
            throw  new EmployeeException("employee list is empty ");
        }
        else {
            return repository.findAll();
        }
    }

}
