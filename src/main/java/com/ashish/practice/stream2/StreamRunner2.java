package com.ashish.practice.stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunner2 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(89, "Sam"));
		list.add(new Student(78, "Zac"));
		list.add(new Student(45, "Mark"));
		
		list.forEach(System.out::println);
		
		System.out.println("#########################3");
		
		
		list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		
	}

}
