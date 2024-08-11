package com.demo.problemSolving;

public class SingletonExample {
	
	private static SingletonExample singleton;
	private SingletonExample(){
		
	}

	
	public static SingletonExample getObj() {
		if(singleton==null)
			singleton= new  SingletonExample();
		
		return singleton;
	}
}
