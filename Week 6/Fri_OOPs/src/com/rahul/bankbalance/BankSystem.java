package com.rahul.bankbalance;

public class BankSystem {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(10000, 10);
		savingAccount.showBalance();
		savingAccount.calculateInterest();

	}

}
