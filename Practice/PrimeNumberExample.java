package com.rahul.primenumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 7, 5, 81, 31, 41);
		List<Integer> prime = list.stream().filter(n->n>1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(m->n%m!=0)).collect(Collectors.toList());
		System.out.println(prime);
	}

}
