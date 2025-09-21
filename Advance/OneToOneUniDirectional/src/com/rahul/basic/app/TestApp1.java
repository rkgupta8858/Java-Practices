package com.rahul.basic.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rahul.basic.entity.Address;
import com.rahul.basic.entity.Employee;

public class TestApp1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rahul");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		Integer empId = sc.nextInt();
		
		System.out.print("Enter Employee Name : ");
		String empName = sc.nextLine();
		empName = sc.nextLine();
		
		System.out.print("Enter Employee Salary : ");
		Double empSal = sc.nextDouble();
		
		
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpSal(empSal);
		
		System.out.print("Enter House No : ");
		Integer houseNo = sc.nextInt();
		
		System.out.print("Enter House Name : ");
		String houseName = sc.nextLine();
		houseName = sc.nextLine();
		
		System.out.print("Enter PinCode : ");
		Integer pinCode = sc.nextInt();
		
		Address address = new Address(); 
		address.setHouseNo(houseNo);
		address.setHouseName(houseName);
		address.setPinCode(pinCode);
		
		employee.setAddress(address);
		et.begin();
			em.persist(employee);
		et.commit();
		
		System.out.println("Record added......");
		
		em.close();
		emf.close();

	}

}
