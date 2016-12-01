package com.apple.thread.synchronization;

public class MyThread implements Runnable{

	Display display;
	String name;
	
	public MyThread(Display display, String name){
		this.display = display;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		
		//wish is synchronized method
		display.wish(name);
		
	}
	
}
