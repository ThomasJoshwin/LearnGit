package com.demo.multithreadingDeadLockExample;

public class MultiThreading {
	
	public static final Object resource1 = new Object();
	public static final Object resource2 = new Object();

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Task1());
		Thread thread2 = new Thread(new Task2());
		
		thread1.start();
		thread2.start();

	}

}
