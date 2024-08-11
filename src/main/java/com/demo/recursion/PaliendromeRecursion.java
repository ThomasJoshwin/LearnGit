package com.demo.recursion;

public class PaliendromeRecursion {
	
	public static String reverse(String str) {
		
		if(str.isEmpty())
			return str;
		else
			return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		
		String str = "salas";
				if(str.equalsIgnoreCase(reverse(str)))
					System.out.println("Paliendrome ");
				else {
					
					System.out.println("nowp");
				}

	}

}
