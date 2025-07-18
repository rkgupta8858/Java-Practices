class Parameter
{
	public static void main(String args[])
	{
		Parameter parameter = new Parameter();
		parameter.methodWithParameter(10,20);
		
		int sub =parameter.methodWithParaAndReturn(20, 10);
		System.out.println("Sub is : "+sub);
		
		int mul = parameter.methodWithoutParaWithReturn();
		System.out.println("Mul is : "+ mul);
		
	}
	
	public void methodWithParameter(int a, int b)
	{
		int c = a+b;
		System.out.println("addition is : "+c);
	}
	
	public int methodWithParaAndReturn(int a, int b)
	{
		int c = a-b;
		return c;
	}
	
	public int methodWithoutParaWithReturn()
	{
		int a=10;
		int b=20;
		int c = a*b;
		return c;
	}
}