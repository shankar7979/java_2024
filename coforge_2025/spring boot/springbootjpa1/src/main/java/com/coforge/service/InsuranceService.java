package com.coforge.service;

import com.coforge.dao.InsuranceRepository;
import com.coforge.model.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository repository;

    public Insurance addInsurance(Insurance insurance) {
        return repository.save(insurance);
    }

    public Insurance searchInsurance(int id) {
        Optional<Insurance> byId = repository.findById(id);
        return byId.get();
    }

    public Insurance removeInsuranceById(int id) {
        Insurance insurance = repository.findById(id).get();
        repository.deleteById(id);
        return  insurance;
    }

    public List<Insurance> getAllInsurance() {
        return repository.findAll();
    }



}
