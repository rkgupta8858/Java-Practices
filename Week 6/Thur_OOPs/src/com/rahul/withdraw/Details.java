package com.rahul.withdraw;

public class Details {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setName("Rahul");
		bank.setAccNo(794000);
		bank.setSalary(5000);
		
		System.out.println("Name is : "+bank.getName());
		System.out.println("Account No is : "+bank.getAccNo());
		System.out.println("Salary is : "+bank.getSalary());
	}

}
