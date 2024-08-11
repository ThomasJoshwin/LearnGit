package com.demo.sorting;

public class BinarySearch {

	
	public static void search(int [] arr,int key) {
		int left=0,right=arr.length-1,mid;
		mid=(left+(right-left))/2;
		
		while(left<=right) {
		if(arr[mid]==key)
		{
			System.out.println(" found at "+mid);
		}else if(key>arr[mid]) {
			left=mid+1;
		}else {
			right=mid-1;
		}
		}
	}
	public static void main(String[] args) {

		 int[] arr = {1, 3, 5, 7, 9, 11, 13};
		 search(arr, 9);
	}

}
