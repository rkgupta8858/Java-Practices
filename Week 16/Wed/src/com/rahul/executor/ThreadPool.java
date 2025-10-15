package com.rahul.executor;

public class ThreadPool implements Runnable {
	String name;

	public ThreadPool(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + " Job Started By Thread : " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " Job Started By Thread : " + Thread.currentThread().getName());

	}
}
