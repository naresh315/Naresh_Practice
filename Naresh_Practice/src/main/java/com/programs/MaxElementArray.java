package com.programs;

public class MaxElementArray {
	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 7};
		int max = findMax(arr);
		System.out.println(max); // prints 9
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
