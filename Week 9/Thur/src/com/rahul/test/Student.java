package com.rahul.test;

public class Student {
	public int id;
	public String name;

	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student s = new Student(10, "abc");
		System.out.println(s.id);
		System.out.println(s.name);
	}

}
