package com.rahul.thread;

class EvenOdd extends Thread {
	public void run() {
		try {
			even();
			odd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("EvenOdd Class Thread name : " + Thread.currentThread().getName());

	}

	private void even() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				Thread.sleep(2000);
				System.out.println("Even : " + i);
			}
		}
	}

	private void odd() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				Thread.sleep(1000);
				System.out.println("Odd : " + i);
			}
		}
	}
}

public class EvenOddCheck {
	public static void main(String[] args) {
		EvenOdd t1 = new EvenOdd();
		t1.start();
		System.out.println("Cureent Thread id : " + Thread.currentThread().getId());
		System.out.println("Cureent Thread name : " + Thread.currentThread().getName());

		Thread.currentThread().setName("Rahul's Thread");
		System.out.println("Cureent Thread name : " + Thread.currentThread().getName());

	}

}
