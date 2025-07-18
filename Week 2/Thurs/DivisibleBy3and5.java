class DivisibleBy3and5
{
	public static void main(String args[])
	{
		int num = 16;
		if(num%3==0 && num%5!=0)
		{
			System.out.println(num + " is divisible by 3 but not 5");
		}
		else if(num%5==0 && num%3!=0)
		{
			System.out.println(num + " is divisible by 5 but not 3");
		}
		
		else if(num%3==0 && num%5==0)
		{
			System.out.println(num + " is DivisibleBy 3 and 5");
		}
		else
		{
			System.out.println(num +" is not divisible by 3 and 5");
		}
	}
}