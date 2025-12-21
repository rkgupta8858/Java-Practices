package com.kodewala;

class MyThread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

public class PrintNumberViaMultipleThread {
	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();
	}
}
