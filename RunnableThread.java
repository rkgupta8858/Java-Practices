package com.kodewala;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThread2.run() : " + Thread.currentThread().getName());

	}

}

public class RunnableThread {

	public static void main(String[] args) {

		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);

		System.out.println(thread);
		thread.start();

	}

}
