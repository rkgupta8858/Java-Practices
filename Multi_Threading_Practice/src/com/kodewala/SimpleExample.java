package com.kodewala;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread1.run() : " + Thread.currentThread().getName());
	}
}

public class SimpleExample {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		System.out.println(Thread.currentThread().getName());
		thread1.start();
	}

}
