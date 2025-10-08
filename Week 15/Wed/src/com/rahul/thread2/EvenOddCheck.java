package com.rahul.thread2;

class MyEvenThread extends Thread {
	public void run() {
		System.out.println("MyEvenThread.run()--> Start");
		System.out.println(Thread.currentThread().getName());
		int i = 10;
		if (i % 2 == 0) {
			System.out.println("Number Is Even !!");
		} else {
			System.out.println("Number is odd !!");
		}

		System.out.println("MyEvenThread.run()--> End");
	}
}

class MyOddThread1 extends Thread {
	public void run() {
		System.out.println("MyOddThread1.run()--> Start");
		System.out.println(Thread.currentThread().getName());
		int j = 9;
		if (j % 2 != 0) {
			System.out.println("Number Is Odd !!");
		} else {
			System.out.println("Number is even !!");
		}
		System.out.println("MyOddThread1.run()--> End");

	}
}

public class EvenOddCheck {

	public static void main(String[] args) {

		MyEvenThread t = new MyEvenThread();
		t.start();

		MyOddThread1 t1 = new MyOddThread1();
		t1.start();
	}

}
