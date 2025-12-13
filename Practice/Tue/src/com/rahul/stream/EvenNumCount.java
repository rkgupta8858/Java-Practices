package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumCount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 6, 8, 25, 80, 50);
		System.out.println("Numbers : "+list);

		List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers : "+evenNumber);

		int count = (int) evenNumber.stream().count();
		System.out.println("Total Even Numbers : "+count);

	}

}
