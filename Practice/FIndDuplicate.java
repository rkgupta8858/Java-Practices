package com.rahul.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDuplicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(101);
		list.add(102);
		System.out.println(list);

		Set<Integer> duplicateElement = list.stream().filter(n -> Collections.frequency(list, n) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicateElement);

		boolean ele = duplicateElement.add(55);
		System.out.println(ele);

		// Another way to find duplicate

		List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 2, 6, 3, 2, 3);
		Set<Integer> set = new HashSet<Integer>();

		Set<Integer> duplicate = list2.stream().filter(number -> !set.add(number)).collect(Collectors.toSet());
		System.out.println(duplicate);

		boolean newElement = duplicate.add(2);
		System.out.println(newElement);

	}

}
