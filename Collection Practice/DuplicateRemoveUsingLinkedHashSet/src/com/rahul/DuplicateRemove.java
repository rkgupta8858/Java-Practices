package com.rahul;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 4, 3, 4 };

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int n : arr) {
			set.add(n);
		}
		System.out.println(set);
	}
}
