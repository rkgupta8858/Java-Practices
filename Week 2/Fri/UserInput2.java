import java.util.Scanner;

class  UserInput2
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your Age : ");
		while(!scanner.hasNextInt())
		{
			System.out.print("Invalid input! Again Enter your age : ");
			scanner.next();
		}
		int age = scanner.nextInt();
		
		System.out.print("Enter your Salary : ");
		while(!scanner.hasNextDouble())
		{
		    System.out.print("Invalid input! Again Enter your Salary : ");
			scanner.next();
		}
		Double salary = scanner.nextDouble();
		
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Salary is : "+salary);
		
	}
}