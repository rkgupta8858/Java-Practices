package com.thread.nextedclass;

class Laptop implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello laptop");
	}
	class Mouse implements Runnable{
		@Override
		public void run() {
			System.out.println("Hello Mouse");	
		}
	}
}


public class AnotherNested {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Thread thread = new Thread(laptop);
		thread.start();

	}

}
