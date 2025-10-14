package com.rahul.synchronization;

public class FundTransfer {

	int totalBalance = 1000;

	public void fundTransfers(int amount) {
		System.out.println("Thread use : " +Thread.currentThread().getName());
		synchronized (this) {

			if (totalBalance >= amount) {
				System.out.println(amount + " Transfered Sucessfully !!");
				totalBalance = totalBalance - amount;
				System.out.println("Available Balance : " + totalBalance);
			} else {
				System.err.println("Fund Not sufficient !!");
			}
		}
	}

}
