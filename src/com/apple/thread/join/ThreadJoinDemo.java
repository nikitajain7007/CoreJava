package com.apple.thread.join;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		Thread thread1 = new Thread(myThread);
		thread1.start();
		thread1.join();
		
		//wait for 1000 ms (1min) and then continue
//		thread1.join(1000);
		
		for(int i=0;i<10;i++){
			System.out.println("Main thread");
		}
	}

}
