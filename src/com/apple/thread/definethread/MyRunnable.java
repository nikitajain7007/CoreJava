package com.apple.thread.definethread;

//Defining a Thread by implementing Runnable
//and overriding run method
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current thread name = "+Thread.currentThread().getName());
		for(int i=0;i<=10;i++){
			System.out.println("Child Thread which implements Runnable");
		}
	}

}
