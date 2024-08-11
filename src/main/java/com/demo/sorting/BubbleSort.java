package com.demo.sorting;

public class BubbleSort {

	public static void main(String[] args) {
//					 0 1 2 3 4 5 6 
		int[] arr = {3,7,4,9,2,5,6};
//				0	 3,7,4,9,2,5,6
//				1	 3,4,7,9,2,5,6
//				2	 3,4,7,9,2,5,6
//				3	 3,4,7,2,9,5,6
//				4	 3,4,7,2,5,9,6,
//				5	 3,4,7,2,5,6,9
		int n=arr.length; //7

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

}
