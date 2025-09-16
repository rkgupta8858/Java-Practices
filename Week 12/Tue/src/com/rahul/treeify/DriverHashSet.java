package com.rahul.treeify;

import java.util.HashSet;

class Student{
	String name;
	public Student(String name) {
		this.name=name;
	}
	
//	@Override
	public int hashCode() {
		return 12345;
	}
}

public class DriverHashSet {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();

		hashSet.add(new Student("Rahul"));
		hashSet.add(new Student("Rohit"));
		hashSet.add(new Student("Ravi"));
		hashSet.add(new Student("Rohan"));
		hashSet.add(new Student("Anand"));
		hashSet.add(new Student("Aryan"));
		hashSet.add(new Student("Ash"));
//		hashSet.add(new Student("Ashu"));
		
		System.out.println(hashSet);
	}

}
