package com.rahul.stream;

import java.util.Arrays;
import java.util.List;

public class MinimumFind {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 6, 8, 25, 80, 50);
		System.out.println("Numbers : " + list);

		Integer minNumber = list.stream().min(Integer::compareTo).get();
		System.out.println("Minimum Number is : " + minNumber);

		Integer minNumber1 = list.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println("Minimum Number is : " + minNumber1);

		Integer minNumber2 = list.stream().reduce(Integer.MAX_VALUE, Integer::max);
		System.out.println("Minimum Number is : " + minNumber2);

	}

}
