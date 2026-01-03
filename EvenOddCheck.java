package com.kodewala;

class EvenOdd extends Thread {
	@Override
	public void run() {
		try {
			even();
			odd();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("EvenOdd class Thread Name : " + Thread.currentThread().getName());
	}

	private void even() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				Thread.sleep(2000);
				System.out.println(i);
			}
		}
	}

	private void odd() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
	}
}

public class EvenOddCheck {
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.start();

		System.out.println("Current Thread id : " + Thread.currentThread().getName());
		System.out.println("Current Thread Name : " + Thread.currentThread().getName());

		evenOdd.setName("Rahul's Thread");
		System.out.println("New Thread Name : " + Thread.currentThread().getName());

	}

}
