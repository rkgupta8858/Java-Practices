package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Address;
import com.rahul.basic.entity.Employee;

public class TestApp3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id : ");
		Integer empId = sc.nextInt();
		Employee employee = em.find(Employee.class, empId);
		
		if(employee!=null) {
			System.out.println("Id is : " + employee.getEmpId());
			System.out.println("Name is : " + employee.getEmpName());
			System.out.println("Salary is : " + employee.getEmpSal());
			
			Address address = employee.getAddress();
			System.out.println("House No is : "+address.getHouseNo());
			System.out.println("House Name is : "+address.getHouseName());
			System.out.println("PinCode is : "+address.getPinCode());
			
			System.out.println("----------------------------");
		}
		else {
			System.out.println("Employee Data Not Found");
		}
	}

}
