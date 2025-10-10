package com.thread.runnable;

class Cooking implements Runnable {
	String name;

	public Cooking(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name +" is Ready for Serving by "+Thread.currentThread().getName());
	}
}

public class RestaurentManager {

	public static void main(String[] args) {
		Cooking cooking = new Cooking("Pasta");
		Cooking cooking1 = new Cooking("Maggie");
		Cooking cooking2 = new Cooking("Dosa");
		Cooking cooking3 = new Cooking("Hakka Noddels");
		Cooking cooking4 = new Cooking("Chicken Wings");

		Thread t = new Thread(cooking);
		Thread t1 = new Thread(cooking1);
		Thread t2 = new Thread(cooking2);
		Thread t3 = new Thread(cooking3);
		Thread t4 = new Thread(cooking4);
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		// to simplify code redability use below line instead of uppar line
		
		Thread thread = new Thread(new Cooking("Butter Chicken"));
		thread.start();
		
	}
}
