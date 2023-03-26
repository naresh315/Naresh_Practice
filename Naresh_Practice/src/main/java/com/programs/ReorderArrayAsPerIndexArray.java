package com.programs;

import java.util.Arrays;

public class ReorderArrayAsPerIndexArray {
public static void main(String[] args) {
	int arr[]   = {10, 23, 12,11};	
	int index[] = {1, 3, 2,0};
	reorderArray(arr,index);
	System.out.println(Arrays.toString(arr));
}

public static void reorderArray(int[] arr, int[] indexes) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        while (indexes[i] != i) {
            int temp = arr[indexes[i]];
            arr[indexes[i]] = arr[i];
            arr[i] = temp;
            int tempIndex = indexes[indexes[i]];
            indexes[indexes[i]] = indexes[i];
            indexes[i] = tempIndex;
        }
    }
}
}
