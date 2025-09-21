package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestApp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter New Employee Name: ");
        String empName = sc.next();

        System.out.print("Enter New Employee Salary: ");
        double empSal = sc.nextDouble();
		
		String jpql = "update Employee e set e.empName=?1, e.empSal=?2 where e.empId=?3";
		
		Query q = em.createQuery(jpql);
		q.setParameter(1, empName);
		q.setParameter(2, empSal);
		q.setParameter(3, empId);
		
		et.begin();
			Integer count = q.executeUpdate();
		et.commit();
		
		System.out.println(count+" Object Updated......");

	}

}
