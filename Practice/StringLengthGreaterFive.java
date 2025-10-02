package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthGreaterFive {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ravi", "Rohan", "Abhishek", "Aanand");
		System.out.println(list);

		List<String> element = list.stream().filter(n -> n.length() >= 5).collect(Collectors.toList());
		System.out.println(element);

	}

}
