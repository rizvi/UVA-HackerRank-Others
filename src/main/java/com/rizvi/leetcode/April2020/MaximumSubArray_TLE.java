package com.rizvi.leetcode.April2020;

/**
 * @author Rizvi on 4/19/2020
 * @project UVA-HackerRank-Others
 */
// Time Limit Exceed khai... problem ase
public class MaximumSubArray_TLE {
	public static void main(String[] args) {
//		int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int nums[] = {-2, -1};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int arrLength = nums.length;
		if (arrLength == 1) {
			return nums[0];
		}
		int maxSum = Integer.MIN_VALUE + 0;
		for (int i = 0; i < arrLength; i++) {
			for (int j = i; j < arrLength; j++) {
				int summation = 0;
				for (int k = i; k <= j; k++) {
					summation = summation + nums[k];
				}
				System.out.println("Summation: " + summation + "   maxSum: " + maxSum);
				if (summation > maxSum) {
					maxSum = summation;
				}
			}
			System.out.println("=================================");

		}
		return maxSum;
	}
}
