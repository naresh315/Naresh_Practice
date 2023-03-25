package com.programs;

import java.util.Arrays;

public class MyMergeArrays {
	public static void main(String[] args) {
		int[] array= {10,11,9,4,2,3,109,115,1117,0};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void mergeSort(int[] array) {
		 if(array.length >1 ) {
			 int mid = array.length/2;
			 int[] left= Arrays.copyOfRange(array, 0, mid);
			 int[] right= Arrays.copyOfRange(array, mid, array.length);
			 mergeSort(left);
			 mergeSort(right);
			 merge(array,left,right);
		 }
		
	}

	private static void merge(int[] array, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < left.length) {
			array[k++] = left[i++];
		}

		while (j < right.length) {
			array[k++] = right[j++];
		}

	}

}
