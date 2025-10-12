package com.rahul.thread1;

class OneToFive extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ConcurrentlyPrint {

	public static void main(String[] args) {
		OneToFive t1 = new OneToFive();
		t1.start();
		
		OneToFive t2 = new OneToFive();
		t2.start();
	}

}
