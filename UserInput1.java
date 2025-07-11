import java.util.Scanner;

class  UserInput1
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your Age : ");
		int age = scanner.nextInt();
		
		System.out.print("Enter your Salary : ");
		Double salary = scanner.nextDouble();
		
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Salary is : "+salary);
		
	}
}