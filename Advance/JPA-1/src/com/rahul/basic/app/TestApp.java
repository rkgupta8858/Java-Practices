package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class TestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Enter the Emp ID : ");
		Integer empId = sc.nextInt();
		
		System.out.println("Enter the Emp Name : ");
		String empName = sc.next();
		
		System.out.println("Enter the Emp Salary : ");
		Double empSal = sc.nextDouble();
		
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpSal(empSal);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
			em.persist(employee);
		et.commit();
		
		System.out.println("Data Saved.........");
	}

}
