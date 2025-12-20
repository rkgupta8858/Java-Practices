package com.stream.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 38500.0));
		employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

//		1. How many male and female employees are there in the organization ?

		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Male & Female : " + collect);

		System.out.println("*****************************************");

//		2. Print the name of all departments in the organization ?

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(name -> System.out.println(name));
		System.out.println("*****************************************");

//		3. What is the average age of male and female employees ?

		Map<String, Double> collect2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Avg age of Male & Female : " + collect2);
		System.out.println("*****************************************");

//		4. Get the details of highest paid employee in the organization ?

		Optional<Employee> collect3 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if (collect3.isPresent()) {
			Employee employee = collect3.get();
			System.out.println("Highest salary emp : " + employee.toString());
		}
		System.out.println("*****************************************");

//		5. Get the names of all employees who have joined after 2015 ?

		List<String> collect4 = employeeList.stream().filter(e -> e.yearOfJoining > 2015).map(e -> e.name)
				.collect(Collectors.toList());
		System.out.println("Emp after 2015 : " + collect4);
		System.out.println("*****************************************");

//		6. Count the number of employees in each department ?
		Map<String, Long> collect5 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Count Each dept emp : " + collect5);
		System.out.println("*****************************************");

//		7. What is the average salary of each department ?

		Map<String, Double> collect6 = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average Salary : " + collect6);
		System.out.println("*****************************************");

//		8. Get the details of youngest male employee in the Development department ?
		Optional<Employee> minAge = employeeList.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
				.min(Comparator.comparing(Employee::getAge));
		if (minAge.isPresent()) {
			System.out.println("Min Age Emp : " + minAge.get());
		}
		System.out.println("*****************************************");

//		9. Who has the most working experience in the organization ?

		Optional<Employee> collect7 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println("Most Work exp : " + collect7);
		System.out.println("*****************************************");

//		10. How many male and female employees are there in the Sales team ?

		Map<String, Long> collect8 = employeeList.stream().filter(e -> e.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("Count Member in sales : " + collect8);
		System.out.println("*****************************************");

//		11. What is the average salary of male and female employees ?

		Map<String, Double> collect9 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect9);
		System.out.println("*****************************************");
//		12. List down the names of all employees in each department ?

		Map<String, List<String>> collect10 = employeeList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(collect10);
		System.out.println("*****************************************");

//		13. What is the average salary and total salary of the whole organization ?
		Double collect11 = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Average Salary : " + collect11);

		double sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum is : " + sum);
		System.out.println("*****************************************");

//		14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?

		List<String> collect12 = employeeList.stream().filter(a -> a.getAge() <= 25)
				.collect(Collectors.mapping(Employee::getName, Collectors.toList()));
		System.out.println("Age lessThan 25 : " + collect12);
		System.out.println("*****************************************");

//		Who is the oldest employee in the organization?		

		Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

		oldestEmployee.ifPresent(emp -> System.out.println("Oldest Employee : " + emp));

	}
}
