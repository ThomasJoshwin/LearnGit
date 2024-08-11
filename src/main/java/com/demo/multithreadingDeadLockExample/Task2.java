package com.demo.multithreadingDeadLockExample;

public class Task2 implements Runnable {

	@Override
	public void run() {
		
		
		synchronized (MultiThreading.resource2) {
			
			System.out.println("locked resource 1 by the thread 2");
			
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (MultiThreading.resource1) {
				System.out.println("locked resource 2 by the thread 2");
			}
		}

	}

}
