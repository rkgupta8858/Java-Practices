import java.util.Scanner;

class BankApplication
{
	static double balance = 1000;
	static double depositeAmount;
	public static void main(String args[])
	{
		System.out.println("Your Bank Account :");
		Scanner sc = new Scanner(System.in);
		
		BankApplication ba = new BankApplication();
		
		System.out.println("If you want to check balance press 1" );
		System.out.println("If you want to deposite balance press 2" );
		int option = sc.nextInt();
		
		if(option==1)
		{
			ba.checkBalance();
		}
		else if(option==2)
		{
			System.out.print("Enter Amount for deposite : ");
			depositeAmount = sc.nextInt();
			ba.deposite(balance);
		}
		else
		{
			System.out.println("Invalid input ! Please Enter only 1 or 2 ");
		}
		
		
	}
	
	public void checkBalance()
	{
		System.out.println("Your Balance is : " + balance);
		
	}
	public void deposite(double balance)
	{
		
		double newBalance = balance-depositeAmount;
		System.out.println("Remaining balance is : "+newBalance);
		
	}
}