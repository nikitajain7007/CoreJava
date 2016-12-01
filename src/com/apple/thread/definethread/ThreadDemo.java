package com.apple.thread.definethread;

public class ThreadDemo {
	public static void main(String[] args){
		
		//To get current thread name
		System.out.println("Current thread name = "+Thread.currentThread().getName());
		
		//Method 1 to instantiate Thread
		MyThread thread1 = new MyThread(); //Thread instantiation
		thread1.start(); //main thread starts child thread
		//now 2 threads are running main thread and thread1
		for(int i=0;i<=10;i++){
			System.out.println("Main Thread");
		}
		
		
		//Method 2 to instantiate Thread
		MyRunnable thread2Runnable = new MyRunnable();
		Thread runnable = new Thread(thread2Runnable);
		runnable.start();
		//now 3 threads
		for(int i=0;i<=10;i++){
			System.out.println("Main Thread Runnable");
		}
		
	}
	
}
