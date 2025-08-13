package com.rahul.countinitobj;

public class ObjectCountUsingInit {
	
	static int  count;
	{
		count++;
	}
	
	public ObjectCountUsingInit() {
	}
	
	public ObjectCountUsingInit(String string) {
		
	}

	public static void main(String[] args) {
		
		ObjectCountUsingInit obc1 = new ObjectCountUsingInit();
		ObjectCountUsingInit obc2 = new ObjectCountUsingInit();
		ObjectCountUsingInit obc3 = new ObjectCountUsingInit();
		ObjectCountUsingInit obc4 = new ObjectCountUsingInit("101");
		System.out.println(count);
	}

}
