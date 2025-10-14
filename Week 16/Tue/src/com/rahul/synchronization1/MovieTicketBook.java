package com.rahul.synchronization1;

class MovieTicket {
	static int totalTocket = 20;

	public static void bookTicket(int ticket) {
		synchronized (MovieTicket.class) {

			if (totalTocket >= ticket) {
				System.out.println(ticket + " Ticket booked !!");
				totalTocket = totalTocket - ticket;
				System.out.println("Remaining Ticket : " + totalTocket);
			} else {
				System.err.println("Insufficient Ticket !!");
			}
		}
	}
}

class MovieTicketThread extends Thread {
	MovieTicket movieTicket;
	int ticket;

	@Override
	public void run() {
		MovieTicket.bookTicket(ticket);
	}

	public MovieTicketThread(MovieTicket movieTicket) {
		this.movieTicket = movieTicket;
	}
}

public class MovieTicketBook {

	public static void main(String[] args) {
		MovieTicket book = new MovieTicket();
		MovieTicketThread movieTicketThread = new MovieTicketThread(book);
		movieTicketThread.ticket = 15;

		MovieTicketThread movieTicketThread1 = new MovieTicketThread(book);
		movieTicketThread1.ticket = 10;

		movieTicketThread.start();
		movieTicketThread1.start();

	}

}
