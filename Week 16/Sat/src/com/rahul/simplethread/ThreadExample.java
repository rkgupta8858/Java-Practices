package com.rahul.simplethread;


class SimpleThread extends Thread{
	@Override
	public void run() {
		System.out.println("SimpleThread.run()"+Thread.currentThread().getName());
		speed();
	}
	
	public synchronized void speed() {
		System.out.println("Speed Method Start !");
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Speed Method End !");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		SimpleThread simpleThread1 = new SimpleThread();
		simpleThread1.start();
		
		SimpleThread simpleThread2 = new SimpleThread();
		simpleThread2.start();
		
		SimpleThread simpleThread3 = new SimpleThread();
		simpleThread3.start();

	}

}
