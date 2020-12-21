package com.ashish.practice.compareobjects2;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	
	private String name;
	
	private double marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, double marks) {
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.rollNo, that.rollNo);
	}
	
	

}
