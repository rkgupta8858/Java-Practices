package com.stream;

import java.util.Arrays;
import java.util.List;

public class Multiply {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 5, 4, 8, 3, 9, 4);

		numbers.stream().map(n -> n * 10).forEach(n -> System.out.println(n));
	}
}
