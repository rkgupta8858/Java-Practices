package com.rahul.thread1;

class OneToTen extends Thread {
	@Override
	public void run() {
		System.out.println("1 To 10 print !!");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class PrintOneToTen {

	public static void main(String[] args) {
		OneToTen oneToTen = new OneToTen();
		oneToTen.start();
	}

}
