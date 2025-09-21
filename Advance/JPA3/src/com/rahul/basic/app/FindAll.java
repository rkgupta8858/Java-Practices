package com.rahul.basic.app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rahul.basic.entity.Employee;


public class FindAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		String jpql = "select e from Employee e";
		Query q = em.createQuery(jpql);
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
