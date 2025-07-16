package com.coforge.singleton;

public class DepartmentMain {

	public static void main(String[] args) {
		
		//Department department=new Department()
		    // error as constructor is private 
	
		Department department=Department.getDepartment();
		Department department1=Department.getDepartment();
		
		department.setId(10001);
		department.setName("training");
		
		department1.setId(10002);
		department1.setName("payment");
		
		System.out.println(department.getId()+" "+department.getName());
		
		
		System.out.println(department1.getId()+" "+department1.getName());
		
		
	}
}
