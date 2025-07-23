import java.util.Scanner;

class BankPasswordValidation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String password = "Rahul@1234";
		String userPass=null;
		int noOfTry = 0;
  		while(noOfTry<5)
		{
			
			System.out.print("Enter The Password : ");
			userPass = sc.next();
			if(password.equals(userPass))
			{
				System.out.println("Correct Password !! Now You Are login !!");
				return;
			}
			else if(noOfTry<4)
			{
				System.out.println("Incorrect password ! Try Again");			}
			else
			{
				System.out.println("Maximum Attempt !! Tye again After 24 Hours");	
			}
			noOfTry++;
		}
		
	}
	
}