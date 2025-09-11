package com.rahul.collections;

import java.util.ArrayList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(201);
		al.add(205);
		al.add(205);
		al.add(205);
		al.add(205);
		al.add(205);
		al.add(205);
		al.add(45);
		al.add(45);
		al.add(45);
		al.add(45);
		al.add(25);
		
		System.out.println(al);
		int length = al.size();
		for(int i = 0; i<length; i++)
		{
			for (int j = i+1; j <length-1; j++) {
				 if (al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
					length--;
				}
				
			}
			
		}
		System.out.println(al);

	}

}
