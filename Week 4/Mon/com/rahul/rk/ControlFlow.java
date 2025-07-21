package com.rahul.rk;

class ControlFlow
{
	public static void main(String args[])
	{
		ControlFlow cf = new ControlFlow();
		String result = cf.checkDis(60);
		System.out.println("is it greater than 75 : "+result);
		
	}
	
	public String checkDis(int mark)
	{
		String result = null;
		if(mark>=75)
		{
			result =  "D";
		}
		else
		{
			result = "no it is not";
		}
		return result;
	}
}