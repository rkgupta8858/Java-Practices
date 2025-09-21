package com.rahul.JPAExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.entity.Practice;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	
    	Practice p = new Practice();
//    	p.setEmpId(102);
    	p.setEmpName("Rahul");
//    	p.setEmpSal(60000.0);
    	
    	et.begin();
    		em.persist(p);
    	et.commit();
    	
    	em.close();
    	emf.close();
    	
    	System.out.println("Saved--------");
    }
}
