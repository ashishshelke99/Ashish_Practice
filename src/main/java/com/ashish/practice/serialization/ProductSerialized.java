package com.ashish.practice.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerialized {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("./resources/Prod1.ser");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(new Product(1, "DELL Inspiron R", 45000));
		
		System.out.println("object write success");
		
	}

}
