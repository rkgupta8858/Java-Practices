package com.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kodewala", "Academy", "Java", "Spring", "Stream");

		list.parallelStream().forEach(item -> System.out.println(Thread.currentThread().getName() + " - " + item));

	}
}
