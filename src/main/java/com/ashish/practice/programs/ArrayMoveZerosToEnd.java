package com.ashish.practice.programs;

import java.util.Arrays;

public class ArrayMoveZerosToEnd {
	
	public static void moveZerosToEnd(int[] arr, int length) {
		
		int count = 0;
		int temp;
		
		for(int i=0; i<length; i++) {
			if(arr[i] != 0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count = count + 1;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,4,1,7,0,3,6,0,0,5,2,9};
		
		moveZerosToEnd(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}


}

