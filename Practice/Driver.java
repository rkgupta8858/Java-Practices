package com.rahul.callable1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Callable<String>
{

	@Override
	public String call() {
		System.out.println("MyThread.call()"+ Thread.currentThread().getName());
		String cars =car();
		return cars;
		
	}
	public String car() {
		System.out.println("MyThread.car()"+Thread.currentThread().getName());
		return null;
	}
	
}

public class Driver {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.submit(myThread);
		}
		executorService.shutdown();
	}

}
