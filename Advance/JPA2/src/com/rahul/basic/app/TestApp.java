package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class TestApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter Employee Id :");
		Integer empId = sc.nextInt();
		
		System.out.print("Enter Employee Name : ");
		String empName = sc.next();
		
		System.out.print("Enter Employee Salary : ");
		Double empSal = sc.nextDouble();
		
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setEmpSal(empSal);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rahul");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
			entityManager.persist(emp);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("Operation Success....");
	}

}
