package com.kodewala;

public class ThreadInfo extends Thread {

	@Override
	public void run() {
		System.out.println("Name : " + getName());
		System.out.println("Id : " + getId());
	}

	public static void main(String[] args) {
		new ThreadInfo().start();
	}

}
