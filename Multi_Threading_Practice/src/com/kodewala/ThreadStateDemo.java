package com.kodewala;

public class ThreadStateDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		ThreadStateDemo t = new ThreadStateDemo();

		System.out.println(t.getState()); // NEW
		t.start();
		System.out.println(t.getState()); // RUNNABLE
	}
}
