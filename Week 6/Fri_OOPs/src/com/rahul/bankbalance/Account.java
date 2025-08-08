package com.rahul.bankbalance;

public class Account {
	double balance;
	
	public Account(double balance)
	{
		this.balance=balance;
	}
	public void showBalance() {
		System.out.println("Account Balance : "+balance);
	}
	
}

