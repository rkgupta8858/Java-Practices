import java.util.Scanner;
// table by user input
class InstaVariable
{
	private int a;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		InstaVariable iv = new InstaVariable();
		int a = sc.nextInt();
		
		System.out.println("The table of "+a+" is :");
		

		for(int i = 1; i<=10; i++)
		{
			System.out.println(a*i);
		}
		
		 
	}
}