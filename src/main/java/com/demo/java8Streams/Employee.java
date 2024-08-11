package com.demo.java8Streams;

public class Employee {
	
	int age;
	String designation;
	String name ;
	
	
	public Employee(int age, String designation, String name) {
		super();
		this.age = age;
		this.designation = designation;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
