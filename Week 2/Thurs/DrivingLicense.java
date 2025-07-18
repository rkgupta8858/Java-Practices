class DrivingLicense
{
	public static void main(String args[])
	{
		int age = 18;
		String state1 = "Karnataka";
		String state2 = "Kerala";
		
		if(age >= 18 && age < 60 &&(state1.equals("Karnataka") || state2.equals("Kerala")))
		{
			System.out.println("Eligible for Applying Driving licance");
		}
		else
		{
			System.out.println("Not eligible for applying Driving Licance");
		}
	}
	
}