package com.apple.thread.join;

public class JoinMainThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThreadMainRefrence.mainThread = Thread.currentThread();
		MyThreadMainRefrence myThreadMainRefrence = new MyThreadMainRefrence();
		Thread thread1 = new Thread(myThreadMainRefrence);
		thread1.start();
		
		for(int i= 0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
		
	}

}
