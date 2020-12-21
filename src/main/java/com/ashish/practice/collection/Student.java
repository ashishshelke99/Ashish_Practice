package com.ashish.practice.collection;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	
	private String firstName;
	
	private String lastName;
	
	private int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String firstName, String lastName, int marks) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks
				+ "]";
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.rollNo, that.rollNo);
	}
	
	

}
