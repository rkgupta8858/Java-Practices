package com.rahul.uniqueinteger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 10, 45, 12, 10, 12, 55);
		List<Integer> unique = list.stream().filter(n -> {
			int count = 0, i = 0, j = list.size() - 1;
			while (i <= j) {
				if (list.get(i).equals(n)) {
					count++;
				}
				if (j != i && list.get(j).equals(n)) {
					count++;
				}
				i++;
				j--;
				if (count > 1) {
					return false;
				}
			}
			return count==1;
		}).collect(Collectors.toList());
		System.out.println(unique);
	}
}
