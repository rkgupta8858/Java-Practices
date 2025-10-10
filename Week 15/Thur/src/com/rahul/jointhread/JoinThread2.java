package com.rahul.jointhread;

class JoinThreadBased extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinThread2 {

	public static void main(String[] args) throws InterruptedException {
		JoinThreadBased t1 = new JoinThreadBased();
		t1.start();
		t1.join();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Thread : " + i);
			Thread.sleep(1000);
		}
	}
}
