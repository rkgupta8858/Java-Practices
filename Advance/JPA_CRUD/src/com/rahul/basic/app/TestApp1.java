package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class TestApp1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 Employee emp = new Employee();
		 
		 System.out.print("Enter Employee Id : ");
		 Integer empId = sc.nextInt();
		 
		 System.out.print("Enter Employee Name : ");
		 String empName = sc.next();
		 
		 System.out.print("Enter Employee Salary : ");
		 Double empSal = sc.nextDouble();
		 
		 emp.setEmpId(empId);
		 emp.setEmpName(empName);
		 emp.setEmpSal(empSal);
		 
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 et.begin();
		 	em.persist(emp);
		 et.commit();
		 
		 em.close();
		 emf.close();
		 
		 System.out.println("Employee Added Successful......");		 
	}

}
