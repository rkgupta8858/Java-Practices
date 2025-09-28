package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 4, 6, 8, 5, 2, 4, 6, 2);
		System.out.println(list);
		List<Integer> squeare = list.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squeare);;
	}

}
