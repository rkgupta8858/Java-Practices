package com.rahul.thread1;

class MyThread extends Thread {
	public void run() {
		System.out.println("My 1st Thread is running !!");
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread1 extends Thread {
	public void run() {
		System.out.println("My 2nd Thread is running !!");
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("ThreadExample.main() --> Start");
		String currentThread = Thread.currentThread().getName();
		System.out.println("Current Thread : "+currentThread);
		
		MyThread t = new MyThread();
		t.start();
		
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		System.out.println("ThreadExample.main() --> End");

	}

}
