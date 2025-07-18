class SBIAccount
{
	int accountNumber;
	String accountType;
	String address;
	String balance;
}

class Driver
{
	public static void main(String args[])
	{
		SBIAccount rahul = new SBIAccount();
		rahul.accountNumber = "7940000100068764";
		rahul.accountType = "Saving Account";
		rahul.address = "J. P. Nagar";
		rahul.balance = "5000000";
		
		SBIAccount amit = new SBIAccount();
		amit.accountNumber = "5252101008674";
		amit.accountType = "Saving Account";
		amit.address = "Jaya Nagar";
		amit.balance = "2000000";
		
		System.out.println("Rahul balance is : "+ rahul.balance);
	}
}