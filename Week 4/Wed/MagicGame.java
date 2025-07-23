import java.util.Scanner;

class MagicGame
{
	public static void main(String args[])
	{
		int luckyNumber = 15;
		int numberEnteredByUser = 0;
		Scanner sc = new Scanner(System.in);
		
		while(luckyNumber != numberEnteredByUser)
		{
			System.out.print("Enter the Lucky Number : ");
			numberEnteredByUser = sc.nextInt();
			if(numberEnteredByUser == luckyNumber)
			{
				System.out.println("Congratulations ! You are the Winner !!");
			}
			else
			{
				System.out.println("Try Again");
			}
		}
	}
}