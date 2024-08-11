 package com.demo.java8Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.Function;
import java.util.function.Supplier;

public class Streams {
	
	public static  String reverse(String str) {
		if(str.isEmpty())
		{
			return str;
		}else {
			return reverse(str.substring(1))+ str.charAt(0);
		}
	}

	public static void main(String[] args) {

		 int[] array= {1,6,8,4,5,0};
		 int[] array2= {1,5,3,4,9};
		 
		 String [] strArray=  {"joshwin","java","vavas","vavas","lalu","jkj","java"};
		 
		 String strg="joshwinn";
		 
		 System.out.println("reverse using recusrion "+reverse(strg));
		 
		 Arrays.stream(array).boxed().sorted();
		 System.out.println( "minimum from an array"+Arrays.stream(array).boxed().sorted().findFirst().get()); 
		 System.out.println("max from an array"+ Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).findFirst().get());
		 
		 Set<Integer> set = new HashSet<Integer>();
		 Arrays.stream(array).boxed().forEach(a->set.add(a));
		 System.out.println( "common elemenst "+Arrays.stream(array2).boxed().filter(b->!set.add(b)).collect(Collectors.toList()));

		 int[] rev  = IntStream.range(0, array.length).map(i->array[array.length-1-i]).toArray();
		 Arrays.stream(rev).forEach(System.out::println);
		 
		 System.out.println("max lemgth of string "+ Arrays.stream(strArray).max((s1,s2)-> Integer.compare(s1.length(), s2.length())).get());
		 
		 System.out.println("after remove dup from the str array"+Arrays.toString(Arrays.stream(strArray).distinct().toArray(String[]::new)));
		 
		 System.out.println(Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).findFirst().get());
		 
		Map<String,Long> map= Arrays.stream(strg.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("occurance of each element in a string"+map);
		
		Set<String> sett = new HashSet<String>();
		System.out.println("duplicate elements from a string "+strg+"  "+Arrays.stream(strg.split("")).filter(s->!sett.add(s)).collect(Collectors.toList()));
		
		System.out.println(Arrays.stream(strg.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(a->a.getValue()>1)
				.map(Map.Entry::getKey).collect(Collectors.toList()));
		
		System.out.println("no repeat element "+Arrays.stream(strg.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(a->a.getValue()==1)
		.map(Map.Entry::getKey).collect(Collectors.toList()));
		
		
		System.out.println("number strsts with 1 "+ Arrays.stream(array).boxed().map(s->s+"").filter(a->a.startsWith("1")).collect(Collectors.toList()));
		
//		int [] array3={1,3,-5,7,8,20,-40,6};
//		Arrays.stream(array3).filter((a,b)-> a+b<=0).map(Integer::new).collect(Collectors.toList());
		
		//Group even and odd numbers in separate lists.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Map<Boolean,List<Integer>> oddEven = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println("Even"+oddEven.get(true));
		System.out.println("Odd"+oddEven.get(false));
	}
	
	}


