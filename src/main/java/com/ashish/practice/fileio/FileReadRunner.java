package com.ashish.practice.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("./resources/Data.txt");
		
//		 List<String> list = Files.readAllLines(path);
//		
//		 System.out.println(list);
//		 
		Files.readAllLines(path).stream().forEach(i -> System.out.print(i + " ")); 
		 
	}

}
