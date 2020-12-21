package com.ashish.practice.geek;

import java.util.HashMap;
import java.util.Map;

public class Run {

	public static void main(String[] args) {
		
		 Geek g1 = new Geek("aditya", 1); 
	        Geek g2 = new Geek("aditya", 1); 
	        
	          
	        Map<Geek, String> map = new HashMap<Geek, String>(); 
	        map.put(g1, "CSE"); 
	        map.put(g2, "IT"); 
	          
	        for(Geek geek : map.keySet()) 
	        { 
	            System.out.println(map.get(geek).toString()); 
	        } 
	  
		
	}

}
