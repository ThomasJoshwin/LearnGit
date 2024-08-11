package com.demo.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(30, "developer", "arun"));
		list.add(new Employee(40,"staff","joyal"));
		list.add(new Employee(59,"director","thomas"));
		
		List<String,List<String>> result= list.stream().filter(emp->emp.getAge()>35)
				.collect(Collectors.groupingBy(Employee::getDesignation,Employee::getName));
				
												

	}

}
