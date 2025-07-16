package com.coforge.singleton;

public class Department {

	private int id;
	private String name;

	private Department() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	static Department department;

	public static Department getDepartment() {
		if (department == null) 
			department = new Department();
		return department;
	}

}
