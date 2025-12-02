package com.rahul;

public class DuplicatRemove {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 4, 4, 3, 4 };
		int temp[] = new int[arr.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			boolean found = false;

			for (int k = 0; k < j; k++) {
				if (arr[i] == temp[k]) {
					found = true;
					break;
				}
			}
			if (!found) {
				temp[j] = arr[i];
				j++;
			}
		}
		 for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }
	}
}
