package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithA {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Rahul", "Abasar", "Amit", "Shivam", "Anand", "Aryan", "Rohan");
		System.out.println(list);
		List<String> nameStartWithA = list.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
		System.out.println(nameStartWithA);
	}

}
