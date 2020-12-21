package com.ashish.practice.collection;

public class Car {
	
	private String name;
	
	public Car(String name) {
		super();
		this.name=name;
	}

	public static void main(String[] args) {
		
		Car myCar = new Car("Honda");
		foo(myCar);
		System.out.println(myCar.getName().equals("Kia"));
		
	}
	
	public static void foo(Car car) {
		System.out.println(car.getName().equals("Honda"));
		car.setName("Kia");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
