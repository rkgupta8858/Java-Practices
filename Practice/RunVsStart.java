package com.rahul.thread;


class OneToTen extends Thread {
	@Override
	public void run() {
		System.out.println("1 To 10 print !!");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Current thread : "+Thread.currentThread().getName());
	}
}

public class RunVsStart {

	public static void main(String[] args) {
		OneToTen oneToTen = new OneToTen();
		oneToTen.run(); // Executes like a normal method call on the current thread (main). No new thread is created.
		oneToTen.start(); //  Creates a new thread and internally calls run() in that new thread’s context.
		System.out.println(oneToTen.isAlive());
	}
}

