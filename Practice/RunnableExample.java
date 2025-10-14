package com.rahul.runnable;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("My Thread is : " + Thread.currentThread().getName());
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		Thread thread1 = new Thread(runnable);
		thread1.start();

		Thread thread2 = new Thread(runnable);
		thread2.start();

		Thread thread3 = new Thread(runnable);
		thread3.start();
	}

}
