package com.rahul.treesetcomparable1;

import java.util.TreeSet;

class Vehicle implements Comparable<Vehicle>{

	private String vehicleName;
	public Vehicle(String _vehicleName) {
		this.vehicleName = _vehicleName;
	}
	
	@Override
	public int compareTo(Vehicle o) {
		return this.vehicleName.length() - o.vehicleName.length();
	}
	@Override
	public String toString() {
		return vehicleName;
	}	
}

public class ComparableBasedOnLength {

	public static void main(String[] args) {
		TreeSet<Vehicle> name =new TreeSet<Vehicle>();
		name.add(new Vehicle("BMW"));
		name.add(new Vehicle("Tata"));
		name.add(new Vehicle("Maruti"));
		name.add(new Vehicle("Fortuner"));
		name.add(new Vehicle("Tesla"));
		name.add(new Vehicle("Nanoooo"));
		//name.add(new Vehicle(null));
		
		System.out.println(name);

	}

}
