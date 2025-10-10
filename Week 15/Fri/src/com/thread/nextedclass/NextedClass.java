package com.thread.nextedclass;

class Electronic extends Thread {
	@Override
	public void run() {
		System.out.println("This class is based on electronic Products");
	}

	class Mobile extends Thread {
		@Override
		public void run() {
			System.out.println("This class is based on Mobiles");
		}
	}
}

public class NextedClass {

	public static void main(String[] args) {
		Electronic electronic = new Electronic();
		electronic.start();
		
		Electronic.Mobile mobile = electronic.new Mobile();
		mobile.start();
		
	}

}
