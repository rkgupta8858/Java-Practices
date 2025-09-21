package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Employee;

public class Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.print("Enter the Employee Id : ");
		Integer empId = sc.nextInt();
		
		Employee emp = em.find(Employee.class, empId);
		if(emp!=null) {
			et.begin();
				em.remove(emp);
			et.commit();
		}
		else 
		{
			System.out.println("Employee not Found....");
		}
		System.out.println("Record Deleted.......");
	}

}
