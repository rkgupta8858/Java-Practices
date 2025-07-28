import java.util.Arrays;


class Array 
{
	public static void main(String args[])
	{
		int[] arr = new int[9];
		System.out.println("it Print hash Code : "+arr);  // 
		System.out.println("Array : "+Arrays.toString(arr));

	}
}


/*
	When you print an array object directly using System.out.println(arr);,
	Java does not print the elements.

	Instead, it prints the type of the array ([I means "array of int") 
	followed by @ and the hashcode of the object in hexadecimal form.
	
	To print array contents, use 
	System.out.println(Arrays.toString(arr));
	but import :- import java.util.Arrays;

*/