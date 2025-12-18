package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 5, 8, 92, 8, 66);
		Optional<Integer> secMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second Highest : " + secMax);

	}
}
