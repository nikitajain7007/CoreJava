package com.apple.thread.threadpriority;

public class MyThreadPriority implements Runnable{

	@Override
	public void run() {
		System.out.println("Child Thread Priority = "+Thread.currentThread().getPriority());
	}

}
