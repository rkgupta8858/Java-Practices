package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Length5 {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Bangalore", "Chennai", "Pune", "Borivali", "Mumbai", "Goa");
		List<String> collect = asList.stream().filter(n -> n.length() > 5).collect(Collectors.toList());

		System.out.println(collect);
	}
}
