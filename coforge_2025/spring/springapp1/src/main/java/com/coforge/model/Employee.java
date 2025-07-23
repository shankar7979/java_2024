package com.coforge.model;

public class Employee {
    private int id;
    private  String  name;
    private  float salary;

    public void init(){
        this.id=87878787;
        this.name="suman kumar";
        this.salary=90000;
        System.out.println("init called ");
    }

    public void cleanup() {
        System.out.println("destroy called ");
        Runtime.getRuntime().gc();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
