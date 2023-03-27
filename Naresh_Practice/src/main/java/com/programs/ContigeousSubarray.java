package com.programs;

public class ContigeousSubarray {
	public static void main(String[] args) {
		System.out.println(((double)3/2));
		int arrInt[] = { -1,3,4,-2,5,-7 };
		int arrInt2[] = { -1, -2, 1, 3 };
		System.out.println(findLargestContingeouSum(arrInt));
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
	static int findLargestContingeouSum (int arr[]) {
		int max_soFar = Integer.MIN_VALUE;
		int max_endHere = 0 ;
		for(int i=0 ; i < arr.length ; i++) {
			max_endHere = max_endHere +arr[i];
			if(max_soFar < max_endHere ) {
				max_soFar = max_endHere ;
				
			}
			if(max_endHere < 0 ) {
				max_endHere = 0;
			}
		}
		return max_soFar;
	}
}
