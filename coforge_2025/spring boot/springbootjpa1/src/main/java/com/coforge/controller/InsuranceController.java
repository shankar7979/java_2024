package com.coforge.controller;

import com.coforge.model.Insurance;
import com.coforge.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class InsuranceController {

    @Autowired
    private InsuranceService service;

    //@RequestMapping("/insurance")
    @GetMapping("/insurance")
    public List<Insurance> getAllInsurance(){
        return  service.getAllInsurance();
    }

    @PostMapping("/insurance")
    public Insurance addInsurance(@RequestBody Insurance insurance){
        return  service.addInsurance(insurance);
    }

}
chutti ho gai