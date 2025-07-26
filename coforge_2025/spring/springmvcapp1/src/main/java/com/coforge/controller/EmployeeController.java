package com.coforge.controller;

import com.coforge.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/emp")
    public String welcome() {
        return "empform";
    }

    @ExceptionHandler({Exception.class})
    public String empError(){
     return  "errorpage";
    }

    @RequestMapping("/empAction")
    public String empAction(@RequestParam("empId") int id, @RequestParam("empName") String nm, ModelMap map) throws Exception {
        if (id <= 0) {
            throw new Exception("invalid id");
        } else if (nm.isBlank()) {
            throw new Exception("invalid name");
        } else {
            Employee employee = new Employee();
            employee.setEmpId(id);
            employee.setEmpName(nm);
            map.addAttribute("employee", employee);
            return "empresult";
        }
    }

}
//http://localhost:8080/springmvcapp1/employee/emp