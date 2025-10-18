import java.util.Scanner;

class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		
/*		if(n==0)
		{
			System.out.println("0");
		}
		else if(n==1)
		{
			System.out.println("1");
		}
*/		
		int first =0;
		int second = 1;
		
		for(int i=1;i<=n;i++)
		{
			int third = first + second;
			first = second;
			second = third;
		}
		System.out.println(first);
	}
		
}