package com.ashish.practice.compareobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.getMarks() == obj2.getMarks()) {
			return 0;
		}
		else if(obj1.getMarks() > obj2.getMarks()) {
			return 1;
		}
		else
		return -1;
	}
	
}

class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.getRollNo() == obj2.getRollNo()) {
			return 0;
		}
		else if(obj1.getRollNo() > obj2.getRollNo()) {
			return 1;
		}
		
	else
		return -1;
	}
	
}

public class Runner {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Sam", 78);
		
		Student s2 = new Student(2, "Jack", 67);
		
		Student s3 = new Student(3, "Zac", 99);
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//Collections.sort(list, new MarksComparator());
		
		//Collections.sort(list, new RollNumberComparator());
		
		System.out.println(list);
		
	}

}
