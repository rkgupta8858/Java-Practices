package com.rahul.divideby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivideBy {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 15, 85, 30, 45, 55, 27);
		List<Integer> output = list.stream().filter(n -> n % 3 == 0 && n % 15 == 0).collect(Collectors.toList());
		System.out.println(output);
	}

}
