package com.demo.java8Streams;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(0,1,3,4,5);
		int n=integerList.size();
		int expectd = (n*(n+1))/2;
		int actual = integerList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(expectd + " " + actual);
		System.out.println("missing::"+(expectd-actual));
	}

}
