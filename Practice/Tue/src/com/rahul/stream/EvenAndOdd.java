package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenAndOdd {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 51, 6, 8, 25, 81, 50);
		System.out.println("Numbers : " + list);

		Map<Boolean, List<Integer>> num = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("Even Number : " + num.get(true));
		System.out.println("Odd Number : " + num.get(false));
	}
}
