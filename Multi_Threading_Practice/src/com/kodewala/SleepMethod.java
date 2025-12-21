package com.kodewala;

public class SleepMethod extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);

				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SleepMethod().start();
	}
}
