package com.rahul;

import java.util.Arrays;

public class DuplicateRemove {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 7, 2, 2, 3, 4, 4, 26, 56, 5 };
		System.out.println("Current Array : " + Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println("Sorted Array  : " + Arrays.toString(arr));

		int j = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				j++;
				arr[j] = arr[i];
			}
		}

		for (int i = 0; i <= j; i++) {
			System.out.println(arr[i] + " ");

		}

	}

}
