package com.ashish.practice.garbagecollection;

import java.util.HashSet;
import java.util.Iterator;

public class GarbageCollector {

	
	public static void main(String[] args) {
		
		 HashSet<String> set=new HashSet();  
         set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");
         set.add(null);
         set.add("Five"); 
         set.add(null);
         
         System.out.println(set.size());
         
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  		
		
	}

}
