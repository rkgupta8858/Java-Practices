
package com.rahul.rk;

class CountEvenInArrayAndStore
{
    public static void main(String args[]) 
	{
        int count = 0;
        int array[] = {10, 20, 13, 11, 22, 21};

        // First, count how many even numbers
        for (int i = 0; i < array.length; i++) 
		{
            if (array[i] % 2 == 0) 
			{
                count++;
            }
        }

        // Create new array for even numbers
        int evenArray[] = new int[count];
        int index = 0;

        // Store even numbers
        for (int i = 0; i < array.length; i++) 
		{
            if (array[i] % 2 == 0) 
			{
                evenArray[index++] = array[i];
            }
        }

        // Print even numbers in array format
        System.out.print("Even numbers array: {");
        for (int i = 0; i < evenArray.length; i++) 
		{
            System.out.print(evenArray[i]);
            if (i < evenArray.length - 1) 
			{
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
