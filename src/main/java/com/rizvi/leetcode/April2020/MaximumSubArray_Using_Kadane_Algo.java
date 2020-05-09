package com.rizvi.leetcode.April2020;

/**
 * @author Rizvi on 4/20/2020
 * @project UVA-HackerRank-Others
 */
public class MaximumSubArray_Using_Kadane_Algo {
	public static void main(String[] args) {
		int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//		int nums[] = {-2, -1};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] A) {
		// stores maximum sum sub-array found so far
		int maxSoFar = A[0];

		// stores maximum sum of sub-array ending at current position
		int maxEndingHere = A[0];

		// traverse the given array
		for (int i = 1; i < A.length; i++)
		{
			// update maximum sum of sub-array "ending" at index i (by adding
			// current element to maximum sum ending at previous index i-1)
			maxEndingHere = maxEndingHere + A[i];

			// maximum sum is should be more than the current element
			maxEndingHere = Integer.max(maxEndingHere, A[i]);

			// update result if current sub-array sum is found to be greater
			maxSoFar = Integer.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}
}

/*
Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 */