package com.apple.thread.threadpriority;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		//Default Priority of main and child thread
		System.out.println("Main Thread priority = "+Thread.currentThread().getPriority());
		
		MyThreadPriority thread1 = new MyThreadPriority();
		Thread priorityThread = new Thread(thread1);
		
		priorityThread.start();
		
		//After setting main thread priority to 7
		Thread.currentThread().setPriority(7);
		System.out.println("Main Thread priority = "+Thread.currentThread().getPriority());
		
		MyThreadPriority thread2 = new MyThreadPriority();
		Thread priorityThread2 = new Thread(thread2);
		
		priorityThread2.start();
		
	}

}
