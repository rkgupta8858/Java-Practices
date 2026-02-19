import java.util.Scanner;

class ValidInputCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Anything : ");
		String input = sc.nextLine();
		
		if(input==null || input.trim().isEmpty())
		{
			System.out.print("False");
		}
		else
		{
			System.out.print("True");
		}
	}

}
