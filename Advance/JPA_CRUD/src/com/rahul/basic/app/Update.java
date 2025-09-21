package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class Update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.print("Enter the Employee ID : ");
		Integer empId = sc.nextInt();
		
		Employee emp = em.find(Employee.class, empId);
		if(emp!=null) {
			System.out.print("Enter Employee Name : ");
			String empName = sc.next();
			
			System.out.print("Enter Employee Salary : ");
			Double empSal = sc.nextDouble();
			
			et.begin();
				emp.setEmpName(empName);
				emp.setEmpSal(empSal);
			et.commit();
			System.out.println("Employee Updation Success.....");
		}
		else {
			System.out.println("Employee Object Not Found");
		}
		
	}

}










