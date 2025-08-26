package com.rahul.banking;

public class Driver {

	public static void main(String[] args) {
		IBanking sa = new SavingAccount(5000);
		double balance = sa.checkBalance();
		System.out.println("Current Balance is : "+balance);
		sa.deposite(1000);
		sa.withdraw(2000);
		balance = sa.checkBalance();
		System.out.println("Current Balance is : "+balance);
		
		System.out.println("----------------------------------------------------------");
		
		IBanking ca = new CurrentAccount(15000);
		double balance1 = ca.checkBalance();
		System.out.println("Current Balance is : "+balance1);
		ca.deposite(1000);
		ca.withdraw(15000);
		balance1 = ca.checkBalance();
		System.out.println("Current Balance is : "+balance1);

	}

}
