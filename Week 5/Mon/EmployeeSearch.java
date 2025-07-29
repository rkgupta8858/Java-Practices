import java.util.Scanner;
import java.util.Arrays;
class EmployeeSearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		
		System.out.println("Enter 5 Employee Name : ");
		
		for(int i=0;i<5; i++)
		{
			name[i]=sc.next();
		}
		System.out.println("Name is : "+ Arrays.toString(name));
		
		System.out.print("Search Employee by Name : ");
		String empName = sc.next();
		
		boolean status = false;
		for(int i=0;i<name.length;i++)
		{
			if(empName.equals(name[i]))
			{
				status=true;
				System.out.println("Employee Found ! Name is : "+name[i]);
				break;
			}
		}
		
		if(status==false)
		{
			System.out.println("Employee Not Found !");
		}
	}
}