import java.util.Scanner;

class PowerOfTwo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		if(n<1)
		{
			System.out.print("This Number is not PowerOfTwo !! ");
		}
		else if(n==1)
		{
			System.out.print("This Number is PowerOfTwo !! ");
		}
		else
		{
			while(n%2==0)
			{
				n=n/2;
			}
			if(n==1)
			{
				System.out.print("This Number is PowerOfTwo !! ");
			}
			else
			{
				System.out.print("This Number is not PowerOfTwo !! ");
			}
		}
	}
}