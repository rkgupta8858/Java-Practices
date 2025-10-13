package com.rahul.synchronization;

class Task {
	public synchronized void printEven() {
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even !!");
			}
		}
	}

	public synchronized void printOdd() {
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " is Odd !!");
			}
		}
	}
}

class OddThread extends Thread {

	Task task;

	public OddThread(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		task.printOdd();
	}
}

class EvenThread extends Thread {
	Task task;

	public EvenThread(Task task) {
		this.task = task;
	}

	@Override
	public void run() {
		task.printEven();
	}
}

public class EvenOddPrint {

	public static void main(String[] args) {
		Task task = new Task();
		OddThread oddThread = new OddThread(task);
		EvenThread evenThread = new EvenThread(task);

		oddThread.start();
		evenThread.start();
	}

}
