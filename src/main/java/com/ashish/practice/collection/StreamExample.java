package com.ashish.practice.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		
		Address a1 = new Address("Pune", "MH", 411028);
		
		Address a2 = new Address("Hyderabad", "TS", 725998);
		
		Address a3 = new Address("Gurugram", "DL", 980472);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(90, "Ashish", a1));
		empList.add(new Employee(45, "Zac", a2));
		empList.add(new Employee(78, "Tony", a2));
		empList.add(new Employee(32, "Jack", a3));
		empList.add(new Employee(99, "Mark", a1));
		
		
		empList.forEach(e -> System.out.println(e));
		
		System.out.println("########## Sorting by empId with java streams ##########");
		
		empList.stream().sorted(Comparator.comparingInt(Employee::getEmpId))
		.forEach(e -> System.out.println(e));
		
		
		System.out.println("########## Sorting by empName with java streams ##########");

		empList.stream().sorted(Comparator.comparing(Employee::getEmpName))
		.forEach(e -> System.out.println(e));
		
		System.out.println("########## Sorting by empAddress with java streams ##########");

		empList.stream().filter(e -> e.getEmpAddress().getCity().equals("Pune"))
		.forEach(e -> System.out.println(e));
		
		
		
		
		
	}

}
