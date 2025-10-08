package com.rahul.thread;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("ThreadExample.main() --> Start");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("ThreadExample.main() --> End");
	}

}
