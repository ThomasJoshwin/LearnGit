package com.demo.functionalInterfacesExample;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {

		
		// consumer interface takes one argument and do an operation on  it , it does not reutn any value 
	Consumer<Integer> consumer = x-> System.out.println(x);
	//consumer.accept(7);
	int[] intArray = {1,2,3,4,5};
	Arrays.stream(intArray).forEach(x->System.out.println(x));
	}

}
