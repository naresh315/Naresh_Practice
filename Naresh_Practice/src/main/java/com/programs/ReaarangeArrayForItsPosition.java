package com.programs;

import java.util.Arrays;

public class ReaarangeArrayForItsPosition {
public static void main(String[] args) {
	int[] arr = {3, 2, 0, 1}; // Sample array
	rearrangeArray(arr); // Call the method
	System.out.println(Arrays.toString(arr)); // Output: [0, 1, 2, 3]
}
	
	public static void rearrangeArray(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n; i++) {
	        while (arr[i] != i) {
	            if (arr[i] < 0 || arr[i] >= n) { // Handle out of bounds values
	                break;
	            }
	            int temp = arr[arr[i]];
	            arr[arr[i]] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}
}
/*
To rearrange an integer array such that arr[i] = i, you can follow these steps:

Iterate through the array from the first index to the last index.
Check if the current element is equal to the current index. If it is, move to the next element.
If the current element is not equal to the current index, swap the current element with the element at the index given by the value of the current element.
Repeat steps 2-3 until the end of the array is reached.
Here's the Java code to implement this algorithm:
*/