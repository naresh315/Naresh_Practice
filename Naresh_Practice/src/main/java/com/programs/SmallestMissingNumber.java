package com.programs;

import java.util.Arrays;

public class SmallestMissingNumber {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};  
		int smallestMissingNum = findSmallestMissingNumber(arr); // Call the method
		System.out.println(smallestMissingNum); // Output: 3
	}

	public static int findSmallestMissingNumber(int[] arr) {
		Arrays.sort(arr); // Sort the array in ascending order
		int missingNum = 1; // Initialize missingNum to 1
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == missingNum) {
				missingNum++; // Increment missingNum if current element equals missingNum
			} else if (arr[i] > missingNum) {
				return missingNum; // Return missingNum if current element is greater
			}
		}
		return missingNum; // Return missingNum if end of array is reached
	}
}
/*To find the smallest missing number in a Java array, you can follow these steps:

Sort the array in ascending order
Initialize a variable missingNum to 1
Iterate through the sorted array
If the current element is equal to missingNum, increment missingNum
If the current element is greater than missingNum, return missingNum
If you reach the end of the array without finding a missing number, return missingNum
Here's the Java code to implement this algorithm
 * 
 * 
 * 
 * */
 