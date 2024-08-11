package com.demo.java8Streams;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AvgOfListOfNumbers {

	public static void main(String[] args) {

		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 
		 System.out.println(numbers.stream().mapToDouble(Integer::doubleValue).average());
	
		 System.out.println(numbers.stream().mapToInt(Integer::intValue).max());
		 
		 //String concat list 
		 
		 List<String> strings = Arrays.asList("Hello", " ", "World", "!");
	       String string = strings.stream().map(str->str+"").collect(Collectors.joining());
	       
	       System.out.println("string is ::"+string);
	       
	       
	       //find first even number 
	       
	       List<Integer> numList = Arrays.asList(1, 3, 5, 2, 4, 6, 8);
	       
	       System.out.println("first even number from the list is ::"+numbers.stream().filter(x->x%2==0).findFirst());
	       
	       
	       long startTime = System.currentTimeMillis();
	       System.out.println(numList.stream().mapToInt(Integer::intValue).sum());
	       long endtime = System.currentTimeMillis();
	       System.out.println(" sequential time taken is ::"+ (endtime-startTime));
	       startTime= System.currentTimeMillis();
	       System.out.println(numList.parallelStream().mapToInt(Integer::intValue).sum());
	       endtime = System.currentTimeMillis();
	       System.out.println(" parrallel time taken is ::"+ (endtime-startTime));
	      
	       
	       LocalDate date = LocalDate.of(1996,5,5);
	       DayOfWeek dayOfWeek = date.getDayOfWeek();
	}

}
