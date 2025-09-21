package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class TestApp2 {
	public static void main(String []args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		Integer empId = sc.nextInt();
		Employee employee = em.find(Employee.class, empId);
		
		if(employee!=null) {
			et.begin();
				em.remove(employee);
			et.commit();
		}
		else {
			System.out.println("Employee Object Not Found ....");
		}
		System.out.println("Record Removed......");
		
	}
}
