package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class TestApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Enter the Id : ");
		Integer empId = scanner.nextInt();
		
		System.out.print("Enter the Name : ");
		String empName = scanner.next();

		System.out.print("Enter the Salary : ");
		Double empSal = scanner.nextDouble();
		
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpSal(empSal);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
			em.persist(employee);
		et.commit();
		em.close();
		emf.close();
		System.out.println("Operation Success.....");
	}

}