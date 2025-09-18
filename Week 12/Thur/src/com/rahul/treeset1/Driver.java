package com.rahul.treeset1;

import java.util.Iterator;
import java.util.TreeSet;

class Fruits implements Comparable<Fruits>{
	private String fName;

	public Fruits(String name) {
		this.fName = name;
		
	}

	@Override
	public int compareTo(Fruits o) {
		
		//     				 This 
		
	/*	int lengthcom = Integer.compare(this.fName.length(), o.fName.length());
		if (lengthcom != 0) {
			return lengthcom;
		}
		return this.fName.compareTo(o.fName);  
	*/
		
		//    				  or 
		  
	/*	return Integer.compare(this.fName.length(), o.fName.length());
	
	*/ 
		
		//     				  or 
		
		return this.fName.length()-o.fName.length();
		
	}
	
	
	
	@Override
	public String toString() {

		return fName;
	}
}

public class Driver {

	public static void main(String[] args) {
		TreeSet<Fruits> treeSet = new TreeSet<Fruits>();
		treeSet.add(new Fruits("Mangooo"));
		treeSet.add(new Fruits("Banana"));
		treeSet.add(new Fruits("Lichi"));
		treeSet.add(new Fruits("Suger Cane "));
		treeSet.add(new Fruits("Mangooooo"));
		
		System.out.println(treeSet);		

	}

}
