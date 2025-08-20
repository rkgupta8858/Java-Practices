package com.rahul.bank;

abstract class Bank{
	double salary;
	
	Bank(double salary){
		this.salary=salary;
	}
	
	public abstract void interestCalculate();
	
	public void showBalance() {
		System.out.println("Current Salary is : "+salary);
	}
}

class SavingAccount extends Bank{

	double interestRate=5.0;
	
	SavingAccount(double salary) {
		super(salary);
	}
	
	@Override
	public void interestCalculate() {
		double interest = (salary * interestRate)/100;
		salary+=interest;
		System.out.println("Interest is : "+ interest);
		}	
}

class FixedDepositeAccount extends Bank{
	double interestRate=7.5;
	FixedDepositeAccount(double salary) {
		super(salary);
	}
	@Override
	public void interestCalculate() {
		double interest = (salary * interestRate)/100;
		salary+=interest;
		System.out.println("Interest is : "+interest);
	}
}

public class Driver {

	public static void main(String[] args) {
		Bank b1 = new SavingAccount(10000);
		b1.showBalance();
		b1.interestCalculate();
		b1.showBalance();
		
		Bank b2 = new FixedDepositeAccount(20000);
		b2.showBalance();
		b2.interestCalculate();
		b2.showBalance();

	}

}
