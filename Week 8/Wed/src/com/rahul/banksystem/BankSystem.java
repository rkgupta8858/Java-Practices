package com.rahul.banksystem;

public class BankSystem {

	public static void main(String[] args) {
		Account saving = new SavingAccount(10000);
		saving.showBalance();
		saving.calculateInterest();
		saving.showBalance();
		
		Account current = new CurrentAccount(10000);
		current.showBalance();
		current.calculateInterest();
		current.showBalance();
	}

}
