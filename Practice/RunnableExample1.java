package com.rahul.runnable;

public class RunnableExample1 {
	public static void main(String[] args) {
		// 1st way of lambda expression
		
		Runnable runnable =() -> {
			System.out.println("My Thread is : " + Thread.currentThread().getName());
		};
		
		// 2st way of lambda expression
		Runnable runnable1 =() -> System.out.println("My Thread is : " + Thread.currentThread().getName());
	

		Thread thread = new Thread(runnable);
		thread.start();

		Thread thread1 = new Thread(runnable);
		thread1.start();

		Thread thread2 = new Thread(runnable1);
		thread2.start();

		Thread thread3 = new Thread(runnable1);
		thread3.start();
	}
}
