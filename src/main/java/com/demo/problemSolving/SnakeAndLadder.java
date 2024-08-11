package com.demo.problemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadder {
	
	public int play(int result) {
		Map<Integer, Integer> snakes = new HashMap<Integer, Integer>();
		snakes.put(10, 1);
		snakes.put(20, 10);
		snakes.put(30, 5);
		snakes.put(50, 30);
		snakes.put(60, 59);
		Map<Integer, Integer> ladder = new HashMap<Integer, Integer>();
		ladder.put(13, 41);
		ladder.put(17, 50);
		ladder.put(22, 60);
		ladder.put(56, 67);
		ladder.put(67, 90);
			 Random random = new Random();
		     int randomNumber = random.nextInt(6) + 1; 
		     result= result+randomNumber;
		     if(snakes.containsKey(result)) {
		    	 result=snakes.get(result);
		     }else if(ladder.containsKey(result))
		    	 result = ladder.get(result);
		return result;
	}

	public static void main(String[] args) {
		SnakeAndLadder game= new SnakeAndLadder();

	int n=6,i=0;
	int player=0;
	Map<Integer,Integer> resultMap = new HashMap<>();
	while(i<n) {
		int result=game.play(resultMap.get(i)!=null && resultMap.get(i)!=0? resultMap.get(i) : 0);
		resultMap.put(i, result);	
		++i;
		if(resultMap.get(i)!=null && resultMap.get(i)==100) {
			player=i;
			break;
		}
		if(i==n-1 && !resultMap.values().contains(100))
			i=0;
		
			
	}
	System.out.println(resultMap);
	System.out.println("player"+player+"wins");
	
}
	
	
}
