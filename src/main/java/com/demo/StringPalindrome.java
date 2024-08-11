package com.demo;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String string ="malayalam";
		String rev="";
		for(int i=string.length()-1;i>=0;i--)
				rev = rev+string.charAt(i);
		
		if(string.equalsIgnoreCase(rev))
			System.out.println("yessss");
		else
			System.out.println("nopeee");

	}

}
