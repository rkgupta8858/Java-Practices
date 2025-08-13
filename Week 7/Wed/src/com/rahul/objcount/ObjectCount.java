package com.rahul.objcount;

public class ObjectCount {

	static int count=0;
	public ObjectCount()
	{
		count++;
	}
	
	
	public static void main(String[] args) {
		ObjectCount oc1 = new ObjectCount();
		ObjectCount oc2 = new ObjectCount();
		ObjectCount oc3 = new ObjectCount();
		ObjectCount oc4 = new ObjectCount();
		ObjectCount oc5 = new ObjectCount();
		
		System.out.println(count);
		
	}

}
