package com.rahul.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberFind {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 4, 6, 7, 9, 41, 31, 91);
		System.out.println(list);
		List<Integer> prime = list.stream()
				.filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(m -> n % m != 0))
				.collect(Collectors.toList());
		System.out.println(prime);
	}

}
