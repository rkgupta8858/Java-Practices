package com.rahul.synchronization2;

class SeatBook extends Thread {
	int totalSeat = 10;
	int seats;

	@Override
	public void run() {
		booking(seats);
	}

	public synchronized void booking(int seats) {
		if (totalSeat >= seats) {
			System.out.println(seats + " Seats Booked !!");
			totalSeat = totalSeat - seats;
			System.out.println("Remaining seats : " + totalSeat);
		} else {
			System.out.println("Seats not Booked !!");
			System.out.println("Remaining seats " + totalSeat);
		}
	}
}

public class SeatBookExample {

	public static void main(String[] args) {

		SeatBook book = new SeatBook();
		Thread thread = new Thread(book);
		

		Thread thread1 = new Thread(book);
		book.seats = 9;
//		thread.start();
		thread1.start();

	}

}
