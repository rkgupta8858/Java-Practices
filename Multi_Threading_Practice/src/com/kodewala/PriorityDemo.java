package com.kodewala;

public class PriorityDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Name : " + getName() + ", Priority : " + getPriority());
	}

	public static void main(String[] args) {
		PriorityDemo demo = new PriorityDemo();
		demo.setName("HighPriorityThread");
		demo.setPriority(Thread.MAX_PRIORITY);
		demo.start();
	}
}
