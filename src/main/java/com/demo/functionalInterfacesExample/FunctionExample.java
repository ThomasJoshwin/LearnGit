package com.demo.functionalInterfacesExample;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> fn = (str) -> str.length();
		
		System.out.println("size of string is "+fn.apply("joshwin"));
		
		String[] strArray = {"joshwin","nidhi","sachin"};
		
		Arrays.stream(strArray).forEach(str->System.out.println(str+" length is "+fn.apply(str)));
	}

}
