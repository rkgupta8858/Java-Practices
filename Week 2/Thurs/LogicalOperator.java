import java.util.Scanner;

class LogicalOperator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a + " is greater than "+b);
		}
		else if(a>=b)
		{
			System.out.println(a + " is greater than or equal to "+b);
		}
		else if(a<b)
		{
			System.out.println(a + " is less than "+b);
		}
		else
		{
			System.out.println(a + " is less than or equal to "+b);
		}
	}
}