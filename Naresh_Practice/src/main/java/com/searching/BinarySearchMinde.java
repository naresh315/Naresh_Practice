package com.searching;

/**
 * @author naresh
 *
 */
public class BinarySearchMinde {
	
	public static void main(String[] args) {
		int[] array = { 12, 23, 44, 55, 56, 59, 435 };
		int targetPostion = binarySeach(array, 59);
		System.out.println("TargetPostion " + targetPostion);
	}

	private static int binarySeach(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			}
			if (target <= array[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
