import java.util.Scanner;
class DaysPrint
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day : ");
		String day = sc.next();
		switch(day)
		{
			case "mon": System.out.println("Day is : Monday !!");
			break;
			case "tue": System.out.println("Day is : Tuesday !!");
			break;
			case "wed": System.out.println("Day is : Wednesday !!");
			break;
			case "thurs": System.out.println("Day is : Thusrday !!");
			break;
			case "fri": System.out.println("Day is : Friday !!");
			break;
			case "sat": System.out.println("Day is : Saturday !!");
			break;
			case "sun": System.out.println("Day is : Sunday !!");
			break;
			default : System.out.println("Day Not Found");
			break;
			
		}
	}
}