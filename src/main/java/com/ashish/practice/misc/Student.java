package com.ashish.practice.misc;

/*
 * student object cloning
 */

public class Student implements Cloneable {
	
	private int id;
	private String name;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student(1, "zac");
		
		Student s2 = (Student) s1.clone();
				
		
		System.out.println(s1.id + " " + s1.name);
		
		System.out.println(s2.id + " " + s2.name);
		
	}

}
