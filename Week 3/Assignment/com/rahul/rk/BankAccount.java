package com.rahul.rk;

class BankAccount
{
	private int balance = 1000;
	public static void main(String args[])
	{
		BankAccount ba= new BankAccount();
		ba.interestCalculate();
		ba.accountDetails();
	}
	
	
	public void accountDetails()
	{
		String name = "Rahul Kumar Gupta";
		String accNo = "7940000";
		String ifsc = "PUNB0790";
		
		System.out.println("Name is :"+name );
		System.out.println("Account Number is :"+accNo );
		System.out.println("IFSC code is :"+ifsc );
		
	}
	
	protected void interestCalculate()
	{
		int interest = 3;
		int newBalance = balance+(balance*3)/100;
		System.out.println("Balance is : "+newBalance);
	}
	
}