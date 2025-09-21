//  Partial object with one column

package com.rahul.basic.app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestApp2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		String jpql = "select e.empName from Employee e";
		Query q = em.createQuery(jpql);
		List<String> list = q.getResultList();
		Iterator<String> itr = list.iterator();
		System.out.println("\tName");
		System.out.println("---------------------");

		while (itr.hasNext()) {
			String e = itr.next();
			System.out.println("\t"+e);	
			
		}
		System.out.println("---------------------");
	}

}
