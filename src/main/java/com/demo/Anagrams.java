package com.demo;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"abc","bca", "cab", "cba", "def"};
		String string = "cab";
		String[] letters = string.split("");
		
		for (String word : words) {
			int count=0;
			for (String letter : letters) {
				if(word.contains(letter))
					++count;
			}
			if(count==string.length())
				System.out.println(word);
		}
	}

}
