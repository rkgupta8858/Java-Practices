package com.rahul.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("ExecutorThread.run()"+ Thread.currentThread().getName());
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		ExecutorThread executorThread = new ExecutorThread();
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.submit(executorThread);
		}

	}

}
