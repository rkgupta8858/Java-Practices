package com.rahul.reentrant2;

public class EvenOddFind {

	public static void main(String[] args) {
		EvenOddRunnable evenOddRunnable = new EvenOddRunnable();
		Thread thread = new Thread(evenOddRunnable);
		thread.start();
		
		Thread thread1 = new Thread(evenOddRunnable);
		thread1.start();
		
		Thread thread2 = new Thread(evenOddRunnable);
		thread2.start();
		

	}

}
