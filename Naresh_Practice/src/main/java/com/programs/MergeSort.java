package com.programs;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {1910,34,23333,12211225, 2, 9, 1, 7};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr)); // prints [1, 2, 5, 7, 9]
	}

	public static void mergeSort(int[] arr) {
		if (arr.length > 1) {
			int mid = arr.length / 2;
			int[] left = Arrays.copyOfRange(arr, 0, mid);
			int[] right = Arrays.copyOfRange(arr, mid, arr.length);
			mergeSort(left);
			mergeSort(right);
			merge(arr, left, right);
		}
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i < left.length && j < right.length ) {
			if(left[i] <= right[j]) {
				arr[k++] =left[i++];
			}else {
				arr[k++] = right[j++];
			}
		}
		while(i < left.length  ) {
				arr[k++] =left[i++];
		}
		while(i < right.length  ) {
			arr[k++] =right[j++];
	}
	}
}
