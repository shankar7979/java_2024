package com.coforge.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Customer {
    private int customerId;
    private  String  customerName;
    private float  customerSalary;

    private List<String> bikeList;
    private Set<String> mobileSet;
    private Map<String, String> stateMap;


    private Address address;
}
