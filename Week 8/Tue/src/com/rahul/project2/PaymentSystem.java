package com.rahul.project2;

class Payment{
	public void pay(double amount) {
		System.out.println("Processing generic payment of ₹" + amount);
	}
}

class UPIPayment extends Payment{
	public void pay(double amount) {
		System.out.println(amount+" is proceed via UPI !!");
	}
}

class CCPay extends Payment{
	public void pay(double amount) {
		System.out.println(amount+" is proceed via CCPay !!");
	}
}


public class PaymentSystem {
	public static void main(String[] args) {
		Payment payment = new UPIPayment();
		payment.pay(25000);
		
		Payment payment1 = new CCPay();
		payment1.pay(1500);
	}
}
