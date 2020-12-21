package com.ashish.practice.programs;

import java.util.Arrays;

public class ArrayRightRotation {
	
	
	   public static void rightRotateByOne(int[] arr)  {
		   
		   int last = arr[arr.length-1];
		   
		   for(int i=arr.length-2; i>=0; i--) {
			   arr[i+1] = arr[i];
		   }
		   arr[0] = last;
	   }
	 
	    // Function to left rotate an array by r positions
	    public static void rightRotate(int[] arr, int r)   {
	        
	    	for(int i=0; i<r; i++) {
	    		rightRotateByOne(arr);
	    	}
	    	
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
	        int r = 2;
	 
	        rightRotate(arr, r);
	 
	        System.out.println(Arrays.toString(arr));

	}


}
