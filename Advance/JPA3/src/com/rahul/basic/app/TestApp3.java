//  partial object with name

package com.rahul.basic.app;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rahul.basic.entity.Employee;

public class TestApp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
	//	String jpql = "select e from Employee e where e.empName=:EmpName";
		String jpql = "select e from Employee e where e.empName=?1";
		System.out.println("Enter Name : ");
		String empName = sc.next();
		
		Query q = em.createQuery(jpql);
	//	q.setParameter("EmpName", empName);
		q.setParameter(1, empName);
		List<Employee> list = q.getResultList();
		Iterator<Employee> itr = list.iterator();
		
		System.out.println("\tNo\tName\tSalary");
		System.out.println("---------------------------------------------");

		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println("\t"+e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSal());	
		}
		System.out.println("---------------------------------------------");

	}

}
