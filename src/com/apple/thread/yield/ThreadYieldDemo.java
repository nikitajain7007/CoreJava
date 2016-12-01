package com.apple.thread.yield;

public class ThreadYieldDemo {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		thread1.start();
		
		for(int i=0; i<10;i++){
			System.out.println("Main Thread Runnable");
			Thread.currentThread().yield();
		}
		
	}

}
