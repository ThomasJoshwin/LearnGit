package com.demo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CopyArryas {

	public static void main(String[] args) {

		int[] array1 = {1,2,3,4};
		int[] array2 = {5,6,7,8};
		int[] combined = new int[array1.length+array2.length];
		
		System.arraycopy(array1, 0, combined, 0, array1.length);
		System.arraycopy(array2, 0, combined, array1.length, array2.length);
		
		Arrays.stream(combined).forEach(e->System.out.println(e));
		
		List<int[]> listArray = new ArrayList<>();
		int[] intArray = {1, 2, 3, 4, 5};

		//Integer[] integerArray = Arrays.stream(intArray).mapToObj(Integer::new).limit(2).toArray(Integer[]::new);
		listArray.add(intArray);
		
		Iterator<int[]> itr = listArray.iterator();
		while (itr.hasNext()) {
			int[] integers = (int[]) itr.next();
			Arrays.stream(integers).forEach(e->System.out.println("new"+e));
			
			
		}
		
	}

}
