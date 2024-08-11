package com.demo.functionalInterfacesExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiFunctionExample {

	public static void main(String[] args) {

		List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5, 6);
        
		BiFunction<Integer, Integer, Integer> biFn = (x,y) -> x+y;
		System.out.println(biFn.apply(5, 6));
		
		 IntStream.range(0, nums1.size()).map(i-> biFn.apply(nums1.get(i), nums2.get(i))).forEach(x->System.out.println(x));
		 
		 nums1.stream().map(x->x*2).forEach(i->System.out.println(i));
		 IntStream.range(0, nums1.size()).map(i->biFn.apply(nums1.get(i), nums2.get(i))).reduce(0,Integer::sum);
		 
		System.out.println(nums1.stream().reduce(Integer::sum).get());
		
		System.out.println("maximun is "+nums1.stream().max((x,y) -> Integer.compare(x, y)));
		
		
		
	}

}
