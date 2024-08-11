package com.demo.problemSolving;

import java.util.Random;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		 Random random = new Random();
	     int randomNumber = random.nextInt(6) + 1; 
	}

}
