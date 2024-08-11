package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.StringUtils;

public class MostFrequencyWord {

	public static void main(String[] args) {
		
		String s= "are you are";

		String[] words = s.split(" ");
		String mostWord=null;
		int maxFreq=0;
		for(int i=0;i<words.length;i++)
		{
			String temp=words[i];
			int count=1;
					for(int j=i+1;j<words.length-1;j++)
					{
						if(temp.equalsIgnoreCase(words[j]))
							count++;
					}
			if(maxFreq<count)
			{
				maxFreq=count;
				mostWord=temp;
				//System.out.println(temp);
			}
		}
		
		System.out.println(mostWord+"----->"+maxFreq);
		
	}

}
