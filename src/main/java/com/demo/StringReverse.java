package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer[] arr = {1, 2, 3, 4, 2, 5, 6, 1};

//	        List<Integer> duplicates = Arrays.stream(arr)
//	                .collect(Collectors.groupingBy(i -> i))
//	                .entrySet().stream()
//	                .filter(entry -> entry.getValue().size() > 1)
//	                .map(entry -> entry.getKey())
//	                .collect(Collectors.toList());
//
//	        System.out.println("Duplicate elements: " + duplicates);
//	        
	        int num =5;
	        System.out.println(num==1?"one":(num==2) ?"two":(num==5)?"five":"none");
	}
	

}
