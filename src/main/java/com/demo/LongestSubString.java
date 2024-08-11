package com.demo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {

		
		String str="abcdeafghijkk";
		int start=0,end=0,maxLength=0,currentLength=0,n=str.length();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String result="";
		while(end<n) {
			
			
			char c=str.charAt(end);
			if(map.containsKey(c))
				start=map.get(c)+1;
			map.put(c, end);
			currentLength=end-start+1;
			if(currentLength>maxLength) {
				maxLength=currentLength;
				result=str.substring(start,end+1);
				System.out.println(result);
			}
			end++;
		}
		
		System.out.println(result);
	}

}
