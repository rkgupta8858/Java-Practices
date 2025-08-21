package com.rahul.interfaces;

public class Driver {

	public static void main(String[] args) {
		IBanking ib = new BankingImpl();
		ib.pay();
		ib.settel();
		ib.cancleCheque();
		ib.stopPayment();
		ib.doRTGSPayment();
		int d = ib.run(10,20);
		System.out.println(d);
	}

}
