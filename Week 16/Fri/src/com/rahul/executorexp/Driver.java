package com.rahul.executorexp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("MyThread.run()"+Thread.currentThread().getName());
	}
}



public class Driver {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		MyThread  myThread = new MyThread();
		Thread thread = new Thread(myThread);
		for (int i = 0; i < 5; i++) {
			executorService.execute(thread);
		}
	}

}
