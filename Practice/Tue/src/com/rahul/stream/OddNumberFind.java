package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberFind {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 51, 6, 8, 25, 81, 50);
		System.out.println("Numbers : " + list);

		List<Integer> evenNumber = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Even Numbers : " + evenNumber);

	}

}
