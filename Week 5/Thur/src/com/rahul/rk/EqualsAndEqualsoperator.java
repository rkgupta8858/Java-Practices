package com.rahul.rk;

public class EqualsAndEqualsoperator {

	public static void main(String[] args) {
		Person p1 = new Person("Rahul");
		Person p2 = new Person("Rahul");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		String s1 = new String("Rahul");
		String s2 = new String("Rahul");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String ss = "Rahul";
		String sa = "Rahul";
		
		System.out.println(ss==sa);
		System.out.println(ss.equals(sa));

	}

}
class Person
{
	String name;
	public Person(String name) {
		this.name=name;
	}

	
	
}