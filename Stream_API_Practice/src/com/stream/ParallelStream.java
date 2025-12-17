package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kodewala", "Academy", "Java", "Spring", "Stream", "Js", "HTML", "CSS", "C++", "Boot");

		list.parallelStream().forEach(item -> System.out.println(Thread.currentThread().getName() + " - " + item));
		System.out.println(ForkJoinPool.commonPool().getParallelism());
	} 
}
