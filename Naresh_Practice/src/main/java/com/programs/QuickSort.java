package com.programs;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 1, 3, 7, 4, 6 };
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
	}
}
