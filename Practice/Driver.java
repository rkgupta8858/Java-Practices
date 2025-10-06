package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bengalore", "Mumbai", "Hyd", "Ahm", "Delhi", "Mengalore");
		System.out.println(list);

		Map<Object, List<String>> output = list.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(output);
	}

}
