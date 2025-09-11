// find maximum and minimum element using Sorting technique

package com.rahul.collections;

import java.util.ArrayList;

public class FindMaximumMinimum {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(201);
		al.add(151);
		al.add(141);
		al.add(205);
		
		System.out.println(al);
		int length = al.size();
		for(int i = 0; i<length; i++)
		{
			for (int j = i+1; j <length; j++) {
				if(al.get(i) > al.get(j)) {
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
		
		System.out.println("Minimum element is : "+ al.get(0));
		System.out.println("Maximum element is : "+ al.get(length-1));
	}

}
