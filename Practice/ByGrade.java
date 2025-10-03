package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

	private String name;
	private String grade;

	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class ByGrade {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Rahul", "A"), new Student("Amit", "B"),
				new Student("Bittu", "A"), new Student("Rohit", "C"), new Student("Vikas", "B"));

		Map<String, List<Student>> groupByGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade));
		System.out.println(groupByGrade);

		groupByGrade.forEach((grade, list) -> System.out.println("Grade " + grade + " -> " + list));
	}

}
