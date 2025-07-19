package com.rahul.rk;

class Person 
{
	public static void main(String args[])
	{
		Details details = new Details();
		details.address();
		
	/*	double balance = details.checkBalance();
		System.out.println("Balance is : " + balance);
	*/
	
		details.bankName();
		details.accountNumber();
	
	
	}
	
}

class Details
{
	public void address()
	{
		System.out.println("BTM Layout , Bengaluru");
	}
	
/*	private double checkBalance()
	{
		double balance = 1000;
		return balance;
	}
*/	
	
	void bankName()
	{
		System.out.println("Bank Name is : Punjab National Bank");
	}
	
	protected void accountNumber()
	{
		System.out.println("Account Number is : 7940000100068765");
	}
}
