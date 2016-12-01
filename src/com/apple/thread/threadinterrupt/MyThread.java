package com.apple.thread.threadinterrupt;

public class MyThread implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<=10;i++){
			System.out.println("Child Thread which implements Runnable");
			
				Thread.sleep(1000);
			}
			} catch (InterruptedException e) {
				System.out.println("Child thread got interrupted");
			}
		}
		
	
	
}
