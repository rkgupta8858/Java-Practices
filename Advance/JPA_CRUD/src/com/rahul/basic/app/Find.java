package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class Find {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		System.out.print("Enter the Employee Id : ");
		Integer empId = sc.nextInt();
		Employee emp = em.find(Employee.class, empId);
		if(emp!=null) {
			System.out.println("Id is : " + emp.getEmpId());
			System.out.println("Name is : " + emp.getEmpName());
			System.out.println("Salary is : " + emp.getEmpSal());
		}
		else {
			System.out.println("Employee Data Not Found");
		}

	}

}
