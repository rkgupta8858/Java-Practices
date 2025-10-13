package com.rahul.thread;

class EvenOdd extends Thread{
	@Override
	public void run() {
		printEven();
		printOdd();
	}
	
	public void printEven() {
		for (int i = 1; i <= 5; i++) {
			if (i%2==0) {
				System.out.println(i +" is Even !!");
			}
		}
	}
	public void printOdd() {
		for (int i = 1; i <= 5; i++) {
			if (i%2!=0) {
				System.out.println(i +" is Odd !!");
			}
		}
	}
}


public class EvenOddPrint {

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		eo.start();
//		
//		EvenOdd eo1 = new EvenOdd();
//		eo1.start();

	}

}
