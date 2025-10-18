import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = number;
		int revNum = 0;
		
		/* if(number<0)
		{
			// return false;
			System.out.println("Number is not Palindrome");
		} */
		
		while(n>0)
		{
			int reminder = n % 10;
			revNum = revNum*10+ reminder;
			n = n/10;
		}
		
		if(revNum==number)
		{
			// return true;
			System.out.println("Number is Palindrome");
		}
		else
		{
			// return false;
			System.out.println("Number is not Palindrome");
		}
		
	}
}
