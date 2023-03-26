package com.searching;
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // target found, return index
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 9, 5};
        int target = 9;
        int index = search(arr, target);
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
