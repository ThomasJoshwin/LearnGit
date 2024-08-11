package com.demo.java8Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapExamples {

	public static void main(String[] args) {

		int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int[] oneD = Arrays.stream(twoDArray).flatMapToInt(Arrays::stream).toArray();
		Arrays.stream(oneD).forEach(System.out::println);
		
		int[] oneD1 =Arrays.stream(twoDArray)
                .flatMapToInt(row -> Arrays.stream(row))
                .toArray();
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] list = IntStream.range(0, intArray.length).filter(i-> intArray[i]%2==0).toArray();
		System.out.println(list.toString());
	}

}
