import java.util.Scanner;
import java.util.Arrays;

class ArrayString
{
	public static void main(String args[])
	{
		String arr[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.next();
		}
		System.out.println(Arrays.toString(arr));
	}
}