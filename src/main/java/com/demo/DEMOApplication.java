package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DEMOApplication {

	public static void main(String[] args) {
		SpringApplication.run(DEMOApplication.class, args);
		
		String s1="AAABBCCCCDDDD";  //{a=3, b=2, c=4, d=4}
		
		Map<String,Long> map = Arrays.stream(s1.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(
						s->s, HashMap::new, Collectors.counting()));

		System.out.println("map"+map);
		/////////////////////////////////////////////////////////////////////////////
		
		String[] words = {"hello", "world", "HELLO", "WORLD"}; //{world=2, hello=2}
		
		Map<String, Long> result = Arrays.stream(words).map(String::toLowerCase)
		.collect(Collectors.groupingBy(s->s, HashMap::new, Collectors.counting()));
		
		System.out.println(result);
		
		List<String> result1 =  Arrays.stream(words).map(String::toLowerCase).distinct()
				.collect(Collectors.toList());
		
		System.out.println(result1);
		

		
		
	}

}
