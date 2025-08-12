package com.rahul.chaining;

class School
{
	public School() {
		System.out.println("School Calling");
	}
}

class SchoolStudennt extends School
{
	public SchoolStudennt()
	{
		this("rahul");
		System.out.println("School Student Calling !!");
	}
	public SchoolStudennt(String name)
	{
		System.out.println(name);
	}
}



public class SchoolData {

	public static void main(String[] args) {
		SchoolStudennt schoolStudennt = new SchoolStudennt();

	}

}
