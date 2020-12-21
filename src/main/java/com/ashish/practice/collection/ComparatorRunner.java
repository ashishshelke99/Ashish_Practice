package com.ashish.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class MarksComparatorRunner implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
	
		if(obj1.getMarks()==obj2.getMarks())  
			return 0;  
			else if(obj1.getMarks()>obj2.getMarks())  
			return 1;  
			else  
			return -1;  
	}
	
}

class RollNumberComparatorRunner implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
	
		if(obj1.getRollNo()==obj2.getRollNo())  
			return 0;  
			else if(obj1.getRollNo()>obj2.getRollNo())  
			return 1;  
			else  
			return -1;  
	}
	
}



public class ComparatorRunner {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Ashish", "Shelke", 78);
		
		Student s2 = new Student(89, "Zac", "Efron", 81);
		
		Student s3 = new Student(45, "Sam", "Kom", 90);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//System.out.println(list);
		
		System.out.println("Sorting by marks");
		
		Collections.sort(list, new MarksComparatorRunner());
		
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("############");
		

		System.out.println("Sorting by rollno");
		
		Collections.sort(list, new RollNumberComparatorRunner());
		
		Iterator<Student> itr2 = list.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
		

		
		
	}

}
