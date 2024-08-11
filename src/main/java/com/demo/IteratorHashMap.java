package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Map<String, Integer> hashMap = new HashMap<>();

	        hashMap.put("apple", 1);
	        hashMap.put("banana", 2);
	        hashMap.put("cherry", 3);
	        
	        Iterator<Map.Entry<String, Integer>>  itr = hashMap.entrySet().iterator();
	        
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next().getKey());
	        }

	        System.out.println(hashMap.entrySet());
	}

}
