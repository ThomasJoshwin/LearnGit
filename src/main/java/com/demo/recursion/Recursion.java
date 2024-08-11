package com.demo.recursion;

public class Recursion {

	
	public static void countDown(int n) {
		if(n<=0)
			System.out.println("done");
		else {
			System.out.println(n);
			countDown(n-1);
		}
	}
	public static void main(String[] args) {
		
		countDown(5);
	}

}
