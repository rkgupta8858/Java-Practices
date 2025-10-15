package com.rahul.reentrant2;

public class EvenOddRunnable implements Runnable {
	EvenOdd ed = new EvenOdd();
	
	
	
	@Override
	public void run() {
		ed.evenOdd();
	}
}
