package com.apple.thread.join;

public class MyThreadMainRefrence extends Thread{
	
	static Thread mainThread;
	
	@Override
	public void run() {
		
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++){
			System.out.println("Child Thread which implements Runnable");
		}
		
	}
}
