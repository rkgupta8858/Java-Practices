class Variable
{
	int instance = 100;
	static int st = 200;
	
	public static void main(String args[])
	{
		int local = 10;
		
		Variable variable = new Variable();
		 
		 int sum = variable.instance+st+local;
		 System.out.println("Sum of local, Static and instance variable is : "+sum);
	}
}