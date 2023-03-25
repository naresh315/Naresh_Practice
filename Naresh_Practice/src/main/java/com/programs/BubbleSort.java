package com.programs;

import java.util.Arrays;

/**
 * @author naresh
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 10, 11, 1, 2, 3, 4, 9, 8, 19, 20 };
		bsort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void bsort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}

	}
}
