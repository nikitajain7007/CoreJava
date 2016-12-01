package com.apple.thread.synchronization;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display display = new Display();
		MyThread myThread = new MyThread(display, "Yuvraj");
		Thread thread1 = new Thread(myThread);
		
		MyThread myThread2 = new MyThread(display, "Dhoni");
		Thread thread2 = new Thread(myThread2);
		
		Thread thread3 = new Thread(myThread);
		
		thread1.start();
		thread2.start();
	}

}
