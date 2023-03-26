package com.programs;

public class ContigeousSubarray {
	public static void main(String[] args) {
		System.out.println(((double)3/2));
		System.out.println("SUCK");
		int arrInt[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int arrInt2[] = { -1, -2, 1, 3 };
		System.out.println(findLargestSumContgSubarray(arrInt));
		System.out.println(findLargestSumContgSubarray(arrInt2));
	}

	static int findLargestSumContgSubarray(int[] inputArr) {
		int maxSofar = Integer.MIN_VALUE;
		int maxEndHere = 0;
		for (int i = 0; i < inputArr.length; i++) {
			maxEndHere = maxEndHere + inputArr[i];
			if (maxSofar < maxEndHere) {
				maxSofar = maxEndHere;
			}
			if (maxEndHere < 0) {
				maxEndHere = 0;
			}
		}
		return maxSofar;

	}
}
