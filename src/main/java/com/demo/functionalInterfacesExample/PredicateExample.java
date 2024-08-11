package com.demo.functionalInterfacesExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> pre = x->x%2==0;
	int[] array = {1,2,3,4};
	
	Arrays.stream(array).forEach(x->System.out.println("value is "+x+" "+(pre.test(x)==true ? "even" : "odd")));
	}

}
