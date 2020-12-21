package com.ashish.practice.hashmap;

import java.util.HashMap;

public class MapRunner {

	public static void main(String[] args) {

		Student s1 = new Student(1, "ashish");
		Student s2 = new Student(1, "ashish");
		
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		
		HashMap<Student, String> map = new HashMap<>();
		
		map.put(s1, "stud1");
		map.put(s2, "stud2");
		
		System.out.println(map);
		
		
	}

}
