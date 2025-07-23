import java.util.Scanner;

class GreaterThan10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		
		while(number!=10)
		{
			System.out.print("Enter the Number : ");
			number=sc.nextInt();
			
			if(number>10)
			{
				System.out.println(number+" is greater than 10 ");
			}
			else
			{
				System.out.println(number+" is not greater than 10");
			}
		}
	}
}