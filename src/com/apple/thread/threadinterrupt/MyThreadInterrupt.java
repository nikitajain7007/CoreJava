package com.apple.thread.threadinterrupt;

public class MyThreadInterrupt {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		thread1.start();
		System.out.println("Main Thread");
		thread1.interrupt();
		System.out.println("Main Thread Ends");
	}

}
