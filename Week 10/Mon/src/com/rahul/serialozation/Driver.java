package com.rahul.serialozation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public String empFirstName;
	public String empLastName;
	
	public Employee(String empFirstName, String empLastName) {
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
}


public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e = new Employee("Rahul", "Gupta");
		
		// serialization 
		FileOutputStream fOut = new FileOutputStream("Employee.ser");
		ObjectOutputStream oOut = new ObjectOutputStream(fOut);
		oOut.writeObject(e);
		
		// deserialization 
		
		FileInputStream fIn = new FileInputStream("Employee.ser");
		ObjectInputStream oIn = new ObjectInputStream(fIn);
		
		Employee e1 = (Employee) oIn.readObject();
		
		System.out.println(e1.empFirstName+" "+e1.empLastName);
		
		
		
		
	}

}
