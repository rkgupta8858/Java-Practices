package com.rahul.reentrant2;

import java.util.concurrent.locks.ReentrantLock;

public class EvenOdd {
	ReentrantLock lock = new ReentrantLock();

	public void evenOdd() {
		lock.lock();
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even Number !!");
			} else {
				System.out.println(i + " is Odd Number !!");
			}
		}
		lock.unlock();
	}

}
