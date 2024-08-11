package com.demo.other;

public class GreatestCommonDivisor {

	public static int GCD(int a, int b) {
		
		int i= a<b ? a :b;
		
		for(int j= a>b ? a :b;j>=i;--j)
		{
			if(a%j==0 && b%j==0)
				return j;
		}
		
		return 0;
	}
	public static void main(String[] args) {

		int result = GCD(24, 55);
		System.out.println(result);
	}

}
