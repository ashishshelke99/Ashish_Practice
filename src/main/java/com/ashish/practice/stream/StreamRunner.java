package com.ashish.practice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.ashish.practice.hashmap.Student;


	

public class StreamRunner {

	public static void main(String[] args) {
		
		Address a1 = new Address("Pune", "MH", 411028);
		
		Address a2 = new Address("Hyderabad", "TS", 945089);
		
		Address a3 = new Address("Gurgaon", "DL", 783972);
		
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Ashish", a1));
		empList.add(new Employee(980, "Zac", a1));
		empList.add(new Employee(78, "Pratik", a3));
		empList.add(new Employee(90, "Anna", a2));
		
		
		empList.forEach(e -> System.out.println(e));
		
		System.out.println("#######################");
		
	//	empList.stream().sorted(Comparator.comparing(Address::getEmpAddress()));
		
//		List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
//		sortedList.forEach(e -> System.out.println(e));
//		
		empList.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		
		
		System.out.println("#######################");

		/**
		 * Most IMP Qs. sort custom object field using stream
		 * 
		 */
		
		empList.stream().filter(e -> e.getEmpAddress().getCity().equals("Pune")).forEach(e -> System.out.println(e));
		
		
	}

}
