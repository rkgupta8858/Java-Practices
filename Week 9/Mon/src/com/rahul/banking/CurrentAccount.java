package com.rahul.banking;

public class CurrentAccount implements IBanking {

	private double balance;

	public CurrentAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Deposited " + amount + " in Current Account. New Balance : " + balance);

	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance = balance - amount;
			System.out.println("Withdraw " + amount + " from Current Account. New Balance : " + balance);
		} else {
			System.out.println("Insufficient Balance !!");
		}
	}

	@Override
	public double checkBalance() {
		return balance;

	}

}
