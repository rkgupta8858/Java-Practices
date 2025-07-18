import java.util.Scanner;

class UserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second number : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum of both number	 is  : " +sum);
	}
}