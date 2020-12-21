package com.ashish.practice.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileWriteRunner {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Java SE");
		list.add("Java EE");
		list.add("Hibernate");
		list.add("Spring MVC");
		
		Path path = Paths.get("./resources/DataWrite2.txt");
		
		try {
			Files.write(path, list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Data Write success..");
		}
		
	}

}
