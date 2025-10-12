package com.rahul.synchronization;

class MovieTicket extends Thread {

	int total_seat = 10;

	synchronized void bookSeat(int seats) {
		if (total_seat >= seats) {
			System.out.println(seats + " Ticket Booked Sucessfully !!");
			total_seat = total_seat - seats;
			System.out.println("Availabe Tickets = " + total_seat);
		} else {
			System.out.println("Ticket Not Booked !! ");
			System.out.println("Availabe Tickets = " + total_seat);
		}
	}
}

public class MovieTicketBook extends Thread {
	static MovieTicket mt;
	int seats;

	@Override
	public void run() {
		mt.bookSeat(seats);
	}

	public static void main(String[] args) {
		mt = new MovieTicket();

		MovieTicketBook mtb = new MovieTicketBook();
		mtb.seats = 8;
		mtb.start();

		MovieTicketBook mtb1 = new MovieTicketBook();
		mtb1.seats = 10;
		mtb1.start();
	}
}
