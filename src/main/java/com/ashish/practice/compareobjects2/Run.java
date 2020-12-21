package com.ashish.practice.compareobjects2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		
		if(obj1.getRollNo() > obj2.getRollNo()) {
			return 1;
		}
		else if(obj1.getRollNo() < obj2.getRollNo()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}

class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		
		if(obj1.getMarks() > obj2.getMarks()) {
			return 1;
		}
		else if(obj1.getMarks() < obj2.getMarks()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(23, "shyam", 69);
		Student s2 = new Student(18, "zac", 90);
		Student s3 = new Student(79, "alana", 45);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("RollNumComparator");
		
		Collections.sort(list, new RollNumberComparator());
		
		System.out.println(list);
		
		System.out.println("MarksComparator");
		
		Collections.sort(list, new MarksComparator());
		
		System.out.println(list);

	}

}
