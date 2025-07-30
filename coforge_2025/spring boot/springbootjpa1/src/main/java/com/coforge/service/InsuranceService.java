package com.coforge.service;

import com.coforge.dao.InsuranceRepository;
import com.coforge.model.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository repository;

    public Insurance addInsurance(Insurance insurance){
     return repository.save(insurance);
    }
    public List<Insurance> getAllInsurance(){
     return repository.findAll();
    }


}
