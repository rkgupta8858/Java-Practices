class CheckRange
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 50;
		int number = 51;
		if(number>a && number<b)
		{
			System.out.println(number +" is within the range ");
		}
		else
		{
			System.out.println(number +" is not within the range");
		}
	}
}