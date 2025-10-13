package com.rahul.synchronization1;

class Counter extends Thread {
	static int c = 0;

	@Override
	public void run() {
		count();

	}

	public synchronized void count() {

		for (int i = 0; i <= 10; i++) {
			c++;
		}
	}
}

public class CountExample {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		counter.start();

		Counter counter1 = new Counter();
		counter1.start();
		
		counter.join();
		counter1.join();
		System.out.println("Final count : " + counter.c);
	}

}
