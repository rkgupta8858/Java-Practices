package com.rahul.interfaces;

public class BankingImpl implements IBanking{

	public void pay() {
		System.out.println("Pay method !!");
	}

	public void settel() {
		System.out.println("Settel method !!");
	}

	public void cancleCheque() {
		System.out.println("Cancle Cheque method !!");
	}
	
	public void stopPayment() {
		System.out.println("Stop Payment method !!");
	}

	public void doRTGSPayment() {
		System.out.println("Do RTGS Payment method !!");
	}

	

	@Override
	public int run(int a, int b) {
		int c = a +b;
		return c;
	}

	

}
