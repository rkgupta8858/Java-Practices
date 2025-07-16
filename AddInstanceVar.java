class AddInstanceVar
{
	int a = 100;
	int b = 50;
	public static void main(String args[])
	{
		System.out.println("***************");
		AddInstanceVar aiv = new AddInstanceVar();
		int add = aiv.a + aiv.b;
		System.out.println("Addition of instance variable is : "+ add);
		
		
		System.out.println("***************");
		int sub = aiv.a - aiv.b;
		System.out.println("Substraction of instance variable is : "+ sub);
		
		
		
		System.out.println("***************");
		int mul = aiv.a * aiv.b;
		System.out.println("Multiplication of instance variable is : "+ mul);
		
		
		System.out.println("***************");
		int div = aiv.a / aiv.b;
		System.out.println("Division of instance variable is : "+ div);
		
		
		System.out.println("***************");
		int rem = aiv.a % aiv.b;
		System.out.println("remander of instance variable is : "+ rem);
	}
}