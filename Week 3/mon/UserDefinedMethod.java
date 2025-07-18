import java.util.Scanner;

class UserDefinedMethod
{
	public static void main(String args[])
	{
		UserDefinedMethod udm = new UserDefinedMethod();
		udm.helloWorld();
		udm.table();
		udm.sum();
		
	}
	
	public void helloWorld()
	{
		System.out.println("Hello World !!! ");
	}
	
	public void table()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++)
		{
			int t = num*i;
			System.out.println(num + "*" +i+ "="+t);
		}
	}
	public int sum()
	{
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println("hello");
		System.out.println(c);
		return 0;
		
	}
	
	
}