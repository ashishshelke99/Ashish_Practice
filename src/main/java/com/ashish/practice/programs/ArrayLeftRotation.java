package com.ashish.practice.programs;

import java.util.Arrays;

public class ArrayLeftRotation {
	
	
	   public static void leftRotateByOne(int[] arr)
	    {
	        int first = arr[0];
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	 
	        arr[arr.length - 1] = first;
	    }
	 
	    // Function to left rotate an array by r positions
	    public static void leftRotate(int[] arr, int r)
	    {
	        for (int i = 0; i < r; i++) {
	            leftRotateByOne(arr);
	        }
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 1, 2, 3, 4, 5 };
	        int r = 2;
	 
	        leftRotate(arr, r);
	 
	        System.out.println(Arrays.toString(arr));

	}


}
