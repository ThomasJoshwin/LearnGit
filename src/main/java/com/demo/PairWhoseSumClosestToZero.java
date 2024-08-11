package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PairWhoseSumClosestToZero {

	public static void main(String[] args) {
		
    
    int[] array = {1, 60, -10, 70, -80, 85};
    int minSum = Integer.MAX_VALUE;
    int a=0,b=0;
    
    for(int i=0;i<array.length-1;i++)
    {
    	//System.out.println(array[i]);
    	for(int j=i+1;j<=array.length-1;j++)
    	{
    		System.out.println(array[i]+" "+array[j]);
    		if(Math.abs(array[i]+array[j]) <Math.abs(minSum))
    		{
    			minSum=array[i]+array[j];
    			a=array[i];
    			b=array[j];
    		}
    	}
    }
    
    System.out.println("Result::"+a+" "+b);
	
	
    }
	
	

}
