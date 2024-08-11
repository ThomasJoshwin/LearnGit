package com.demo.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorDemo {

	public static void main(String[] args) {

		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "joshwin");
		map.put(2, "arun");
		map.put(3, "lemy");
		map.put(4, "thomas");
		
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		List<String> list = new ArrayList();
		list.add("joswhin");
		list.add("jjoyal");
		Iterator<String> listItr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("from list "+itr.next());
		}
	}

}
