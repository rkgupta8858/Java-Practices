package com.rahul.reentrant1;

public class BankWithdrawExample {

	public static void main(String[] args) {
		Withdraw withdraw = new Withdraw();
		BankWithdrawRunnable bankWithdrawRunnable = new BankWithdrawRunnable(withdraw);
		Thread thread = new Thread(bankWithdrawRunnable);

		bankWithdrawRunnable.balance = 800;
		
		BankWithdrawRunnable bankWithdrawRunnable1 = new BankWithdrawRunnable(withdraw);
		Thread thread1 = new Thread(bankWithdrawRunnable1);

		bankWithdrawRunnable1.balance = 500;
		thread.start();
		thread1.start();
	}

}
