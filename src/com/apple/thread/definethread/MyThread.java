package com.apple.thread.definethread;

//Defining a Thread by extending Thread class
//and overriding run method
public class MyThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("Current thread name = "+Thread.currentThread().getName());
		for(int i=0; i<=10; i++){
			System.out.println("Child Thread");
		}
		Thread.currentThread().setName("ThreadExtends");
		System.out.println("Current thread name = "+Thread.currentThread().getName());
	}

}
