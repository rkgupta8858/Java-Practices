package com.rahul.bankbalance;

public class SavingAccount extends Account 
{
	double interestRate;
	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest = balance*interestRate/100;
		
		System.out.println("Interest Earned : "+interest );
	}
	
}
