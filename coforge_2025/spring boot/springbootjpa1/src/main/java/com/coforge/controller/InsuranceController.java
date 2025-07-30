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
    public List<Insurance> getAllInsurance() {
        return service.getAllInsurance();
    }

    @PostMapping("/insurance")
    public Insurance addInsurance(@RequestBody Insurance insurance) {
        return service.addInsurance(insurance);
    }

    //http://localhost:8080/insurance/2

    @GetMapping("/insurance/{id}")
    public Insurance searchInsurance(@PathVariable int id) {
        return service.searchInsurance(id);
    }

//http://localhost:8080/insurance?id=1

    @GetMapping("/insurance1")
    public Insurance searchInsurance1(@RequestParam int id) {
        return service.searchInsurance(id);
    }

    @DeleteMapping("/insurance/{id}")
    public Insurance removeInsuranceById(@PathVariable int id) {
        return service.removeInsuranceById(id);
    }


}
