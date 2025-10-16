package com.rahul.reentrant1;

public class BankWithdrawRunnable implements Runnable {
	Withdraw withdraw;
	int balance;

	@Override
	public void run() {
		withdraw.withdrawBalance(balance);
		
	}

	public BankWithdrawRunnable(Withdraw withdraw) {
		this.withdraw=withdraw;
	}

	
	
	

}
