package com.rahul.jointhread;

class Cooking extends Thread{
	@Override
	public void run() {
		System.out.println("Done with cooking !!");
	}
}
class Serving extends Thread{
	@Override
	public void run() {
		System.out.println("Food Serving Started !!");
	}
}

public class JoinThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		Cooking t1 = new Cooking();
		t1.start();
		t1.join();
		Serving t2 = new Serving();
		t2.start();
	}

}
