package com.rahul.synchronization3;

class BookTicket {
	int totalTicket = 10;

	public synchronized void book(int ticket) {
		if (totalTicket >= ticket) {
			System.out.println(ticket + " Ticket Booked Sucessfully !!");
			totalTicket = totalTicket - ticket;
			System.out.println("Available Ticket : " + totalTicket);
		} else {
			System.err.println("Failed !!");
			System.err.println("Available Ticket : " + totalTicket);
		}
	}
}

class Booking extends Thread {
	int ticket;
	BookTicket bookTicket;

	public Booking(BookTicket bookTicket) {
		this.bookTicket = bookTicket;
	}

	@Override
	public void run() {
		bookTicket.book(ticket);
	}
}

public class BookTicketExample {
	public static void main(String[] args) {
		BookTicket bookTicket = new BookTicket();
		Booking booking = new Booking(bookTicket);
		booking.ticket = 6;

		Booking booking1 = new Booking(bookTicket);
		booking1.ticket = 8;

		booking.start();
		booking1.start();

	}
}
