package com.demo.recursion;

public class FibanaciiSeries {
	
	public static void fibonacii(int n) {
		// 0 1 1 2 3 5 

		
		int i=0,j=1,sum=0;
		System.out.println(i);
		System.out.println(j);
		for(int k=2;k<n;k++)
		{
			sum=i+j;
			System.out.println(sum);
			i=j;
			j=sum;
			
		}
	}

	public static void main(String[] args) {
		//0,1,1,2,3
		fibonacii(7);
	}

}
