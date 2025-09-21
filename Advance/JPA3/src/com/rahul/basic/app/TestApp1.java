// Partial object with more then one column

package com.rahul.basic.app;
 import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestApp1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		String jpql = "select e.empId, e.empSal from Employee e";
		Query q = em.createQuery(jpql);
		List<Object[]> list = q.getResultList();
		Iterator<Object[]> itr = list.iterator();
		System.out.println("\tNo\tSalary");
		System.out.println("---------------------------------------------");

		while (itr.hasNext()) {
			Object[] e = itr.next();
			System.out.println("\t"+e[0]+"\t"+e[1]);	
			
		}
		System.out.println("---------------------------------------------");
		

	}

}
