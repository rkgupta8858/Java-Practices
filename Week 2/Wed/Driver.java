class SBIAccount
{
	int accountNumber;
	String accountType;
	String address;
	String balance;
	
	static float interest = 4.5f;
}

class Driver
{
	public static void main(String args[])
	{
		SBIAccount rahul = new SBIAccount();
		rahul.accountNumber = 79400001;
		rahul.accountType = "Saving Account";
		rahul.address = "J. P. Nagar";
		rahul.balance = "5000000";
		
		SBIAccount amit = new SBIAccount();
		amit.accountNumber = 52521012;
		amit.accountType = "Saving Account";
		amit.address = "Jaya Nagar";
		amit.balance = "2000000";
		
		System.out.println("Rahul balance is : "+ rahul.balance);
		System.out.println("Amit balance is : "+ amit.balance);
		
		
		System.out.println("Rahul address is : "+ rahul.address);
		System.out.println("Amit Address is : "+ amit.address);
		
		System.out.println("Interest Rate is : "+ SBIAccount.interest);
		
		
	}
}