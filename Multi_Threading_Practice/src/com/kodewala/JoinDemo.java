package com.kodewala;

public class JoinDemo extends Thread {

	@Override
	public void run() {
		System.out.println("JoinDemo.run() -> " + getName());
	}

	public static void main(String[] args) throws InterruptedException {
		JoinDemo demo = new JoinDemo();
		demo.start();
		demo.join();
		System.out.println("Main thread resumes -> " + Thread.currentThread().getName());
	}
}
