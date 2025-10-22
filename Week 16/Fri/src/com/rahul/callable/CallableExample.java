package com.rahul.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<String>
{
	@Override
	public String call() {
		System.out.println("MyThread.call()"+Thread.currentThread().getName());
		String status = pay();
		return status;
	}
	
	public String pay() {
		System.out.println("MyThread.pay()" + Thread.currentThread().getName());
		return "Success";
	}
}

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyThread myThread = new MyThread();
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i <5; i++) {
			Future<String> future = service.submit(myThread);
			System.out.println(future.get());
		}
		service.shutdown();
	}

}
