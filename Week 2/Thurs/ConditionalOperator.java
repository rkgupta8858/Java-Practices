class ConditionalOperator
{
	public static void main(String args[])
	{
		float amount = 50000f;
		if(amount<=5000)
		{
			System.out.println("Final amount is : " + amount);
		}
		else
		{
			amount = amount - amount*10/100;
			System.out.println("Final amount is : "+ amount);
		}
	}
}