package com.rahul.thread2;

class PriorityThread extends Thread{
	@Override
	public void run() {
		System.out.println("Hello Thread : "+ getPriority());
	}
}

public class PriorityBased1 {

	public static void main(String[] args) {
		PriorityThread t1 = new PriorityThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		
		PriorityThread t2 = new PriorityThread();
		t2.setPriority(Thread.NORM_PRIORITY);
		
		PriorityThread t3 = new PriorityThread();
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
