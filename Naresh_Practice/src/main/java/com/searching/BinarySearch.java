package com.searching;
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] == target) {
                return mid; // target found, return index
            } else if (arr[mid] < target) {
                left = mid + 1; // target is in the right half
            } else {
                right = mid - 1; // target is in the left half
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9};
        int target = 5;
        int index = search(arr, target);
        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
/*
 * Binary Search: Binary search is a more efficient searching algorithm for sorted arrays. 
 *It starts by comparing the target value to the middle element of the array.
 * If the middle element is equal to the target value, the search is complete.
 *If the target value is less than the middle element, the search continues in the lower half of the array.
 * If the target value is greater than the middle element, the search continues in the upper half of the array.
 * This process is repeated until the target value is found or determined to not exist in the array.
 * Binary search has a time complexity of O(log n).
 * */
