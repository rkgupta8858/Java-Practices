package com.rahul.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeSal {

	private String empName;
	private double empSal;

	public EmployeeSal(String empName, double empSal) {
		this.empName = empName;
		this.empSal = empSal;
	}

	public double getEmpSal() {
		return empSal;
	}

	@Override
	public String toString() {
		return this.empName + "->" + this.empSal;
	}
}

public class EmployeeSalaryExample {

	public static void main(String[] args) {
		List<EmployeeSal> list = Arrays.asList(new EmployeeSal("Rahul", 55000), new EmployeeSal("Rohit", 45000),
				new EmployeeSal("Ravi", 65000));
		System.out.println(list);

		List<EmployeeSal> sal = list.stream().filter(s -> s.getEmpSal() > 50000).collect(Collectors.toList());
		System.out.println(sal);
	}

}
