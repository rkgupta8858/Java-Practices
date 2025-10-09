package com.rahul.thread;

class MyThreadCheck extends Thread {
	@Override
	public void run() {
		System.out.println("My First Thread !! " + Thread.currentThread().getName());
	}
}

public class ThreadName {

	public static void main(String[] args) {
		MyThreadCheck t1 = new MyThreadCheck();
		System.out.println("Main Class Thread : "+Thread.currentThread().getName());
		t1.start();
		t1.run();

	}

}
