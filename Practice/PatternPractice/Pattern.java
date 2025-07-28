class Pattern
{
	public static void main(String args[])
	{
		for(int i=5; i>=1;i--)
		{
			for(int j=1; j<6-i; j++)
			{
				System.out.print("1");
			}
			
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}