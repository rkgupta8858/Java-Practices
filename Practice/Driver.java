package com.rahul.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorExample extends Thread {
	@Override
	public void run() {
		System.out.println("My thread : "+ Thread.currentThread().getName());
	}
}

public class Driver {

	public static void main(String[] args) {
		ExecutorExample example = new ExecutorExample();
//		ExecutorService executorService = Executors.newFixedThreadPool(20);
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newScheduledThreadPool(250);
		for (int i = 0; i < 255; i++) {
			executorService.submit(example);
		}
		executorService.shutdown();
		
	}

}
