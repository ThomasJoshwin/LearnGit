package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

	public static void main(String[] args) {

	
String s1="AAABBCCCCDDDD";  //{a=3, b=2, c=4, d=4}
		
		Map<String,Long> map = Arrays.stream(s1.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(
						s->s, HashMap::new, Collectors.counting()));

		System.out.println("map"+map);
		/////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////
		String[] words = {"hello", "world", "HELLO", "WORLD"}; //{world=2, hello=2}
		
		Map<String, Long> result = Arrays.stream(words).map(String::toLowerCase)
		.collect(Collectors.groupingBy(s->s, HashMap::new, Collectors.counting()));
		
		System.out.println(result);
		
		List<String> result1 =  Arrays.stream(words).map(String::toLowerCase).distinct()
				.collect(Collectors.toList());
		
		System.out.println(result1);
		
		
		/////////////////////////////////////////////////
		///     FILTER
		////////////////////////////////////////////////
		
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
		
		List<String> list1 =  list.stream().map(String::toLowerCase)
								   .filter(s->s.contains("d"))
								   .collect(Collectors.toList());
		System.out.println("list1"+list1);
		
		
/////////////////////////////////////////////////
///     FLATMAP
////////////////////////////////////////////////
		
		Person p1 = new Person("joshwin","ust");
		Person p2 = new Person("arun","canada");
		List<Person> personList = new ArrayList<>();
		personList.add(p2);
		personList.add(p1);
		
//		List<String> names = personList.stream().flatMap(p ->p.getName())
//				.collect(Collectors.toList());
		//System.out.println("names are " + names);
	}

}
