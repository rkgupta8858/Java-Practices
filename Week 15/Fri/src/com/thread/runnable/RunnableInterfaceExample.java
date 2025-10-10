package com.thread.runnable;

class SquareFind implements Runnable {
	@Override
	public void run() {
		square();
	}

	private void square() {
		System.out.println("Square State : " + Thread.currentThread().getState());
		System.out.println("Square of 1 to 10 !!");
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " * " + i + " = " + i * i);
		}
	}
}

public class RunnableInterfaceExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getState());
		SquareFind find = new SquareFind();
		Thread t1 = new Thread(find);
		System.out.println("Before Start : " + t1.getState());
		t1.start();
		System.out.println("After Start : " + t1.getState());
//		Thread t2 = new Thread(find);
//		t2.start();
//		Thread t3 = new Thread(find);
//		t3.start();
	}

}
