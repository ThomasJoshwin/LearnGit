package com.demo.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a = {3,7,4,9,2,5,6};
		int n= a.length;
		
		for(int i=0;i<n;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[minIndex])
					minIndex=j;
			}
			
			int temp = a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
