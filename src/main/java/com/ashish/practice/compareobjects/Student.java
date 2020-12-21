package com.ashish.practice.compareobjects;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	
	private String name;
	
	private int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.marks, that.marks);
	}
	
	

}
