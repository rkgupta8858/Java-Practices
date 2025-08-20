package com.rahul.banksystem;

abstract class Account {
	double balance;

	Account(double balance) {
		this.balance = balance;
	}

	abstract void calculateInterest();

	void showBalance() {
		System.out.println("Current Balance : " + balance);
	}

}

class SavingAccount extends Account {
	double interestRate = 5.0;

	SavingAccount(double balance) {
		super(balance);

	}

	@Override
	void calculateInterest() {
		double interest = (balance * interestRate) / 100;
		balance += interest;
		System.out.println("Interest Added : " + interest);
	}
}

class CurrentAccount extends Account {

	CurrentAccount(double balance) {
		super(balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No Interest for Current Class !!");
	}

}
