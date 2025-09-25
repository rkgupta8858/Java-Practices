package com.rahul.uniqueinteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueFind {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 10, 45, 12, 10, 12, 55);
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		System.out.println(list);
		list.stream().collect()
	}

}
