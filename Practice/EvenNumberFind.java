package com.rahul.evennumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFind {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 20, 8, 65, 90);
		List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Number is :"+evenNumber);
		
		
		List<Integer> multi = evenNumber.stream().map(n -> n * 10).collect(Collectors.toList());
		System.out.println(multi);
	}
}
