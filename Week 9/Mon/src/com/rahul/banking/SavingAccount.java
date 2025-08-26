package com.rahul.banking;

public class SavingAccount implements IBanking {

	private double balance;

	public SavingAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Deposited " + amount + " in Saving Account. New Balance : " + balance);

	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance = balance - amount;
			System.out.println("Withdraw " + amount + " from Saving Account. New Balance : " + balance);
		}
		else
		{
			System.out.println("Insufficient Balance !!");
		}
	}

	@Override
	public double checkBalance() {
		return balance;

	}

}
