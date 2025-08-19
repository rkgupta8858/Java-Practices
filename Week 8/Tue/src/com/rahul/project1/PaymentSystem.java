package com.rahul.project1;

class Payment {
	public void processPayment(String name, String cardNumber, double amount) {
		System.out.println("Processing Credit Card Payment...");
		System.out.println("Name is : "+name);
		System.out.println("Card number is : "+cardNumber);
		System.out.println("Amount is : "+ amount);
		System.out.println("Your payment of "+amount+" is successful via Credit Card\n");
	}
	public void processPayment(String upi, int pin, double amount) {
		System.out.println("Processing UPI Payment...");
		System.out.println("UPI is : "+upi);
		System.out.println("Pin number is : "+"****");
		System.out.println("Amount is : "+ amount);
		System.out.println("Your payment of "+amount+" is successful via UPI\n");
	}
	public void processPayment(String wallet, double amount) {
		System.out.println("Processing Wallet Payment...");
		System.out.println("Payment via : "+wallet);
		System.out.println("Amount is : "+ amount);
		System.out.println("Your payment of "+amount+" is successful via Wallet");
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.processPayment("Rahul Kumar Gupta", "7965526555", 2500);
		
		payment.processPayment("rahul@ybl", 273158, 1500);
		
		payment.processPayment("Wallet", 500);
	}
}
