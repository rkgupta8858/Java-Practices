package com.rahul.rk;

public class App {

	public static void main(String[] args) {
		App app = new App();
		int sum = app.addTwoNumber(10, 20);
		System.out.println(sum);
		
	}

	public int addTwoNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public int divTwoNumber(int a, int b) {
		int div = a * b;
		return div;
	}

}
