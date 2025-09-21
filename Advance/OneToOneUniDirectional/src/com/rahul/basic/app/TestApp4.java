package com.rahul.basic.app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rahul.basic.entity.Address;
import com.rahul.basic.entity.Employee;

public class TestApp4 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "Select e from Employee e";
		Query q = em.createQuery(jpql);
		
		List<Employee> list = q.getResultList();
		if(!list.isEmpty()) {
			Iterator<Employee> itr = list.iterator();
			while(itr.hasNext()) {
				Employee employee = itr.next();
				System.out.println("No is : "+ employee.getEmpId());
				System.out.println("Name is : "+ employee.getEmpName());
				System.out.println("Salary is : "+ employee.getEmpSal());
				
				Address address = employee.getAddress();
				
				System.out.println("Hosue No is : "+ address.getHouseNo());
				System.out.println("House Name is : "+ address.getHouseName());
				System.out.println("Pin Code is : "+ address.getPinCode());
				
				System.out.println("---------------------------------");
			}
		}
		else {
			System.out.println("No Record Found .......");
		}
	}

}
