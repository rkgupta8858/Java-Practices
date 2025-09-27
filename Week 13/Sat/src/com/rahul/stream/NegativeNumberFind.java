package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeNumberFind {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, -5, -50, 56, -65);
		System.out.println(list);
		List<Integer> negativeNumber = list.stream().filter(n -> n < 0).collect(Collectors.toList());
		System.out.println(negativeNumber);
	}

}
