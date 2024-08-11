package com.demo;

public class PairsFromArrayWhoseSumIsAtMostZero {

	public static void main(String[] args) {

		int [] arr = {0,1,-1,2,-2};
		int n =arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0 ;j<n;j++)
			{
				if(arr[i]+arr[j]<=0)
				{
					System.out.println(arr[i]+" "+ arr[j]);
				}
			}
		}
		
	}

}
