package com.ashish.practice.oops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Run {

	
	public static void main(String[] args) throws IOException {
	
		Path path = Paths.get("./resources/DataTemp.txt");
		
//		List<String> list = new ArrayList<String>();
//		
//		list.add("Amazon");
//		list.add("Google");
//		list.add("Facebook");
//		list.add("Microsoft");
//		
//		Files.write(path, list);
//		
//		System.out.println("File write success");
		
	
		Files.readAllLines(path).stream().forEach(e -> System.out.println(e));
		
	
	}
	
}
