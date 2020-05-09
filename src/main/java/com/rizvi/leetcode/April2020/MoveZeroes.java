package com.rizvi.leetcode.April2020;

/**
 * @author Rizvi on 4/20/2020
 * @project UVA-HackerRank-Others
 */
public class MoveZeroes {
	public static void main(String[] args) {
//		int nums[] = {0, 7,0,0,0, 0, 3, 12};
		int nums[] = {-1};
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		int arrLen = nums.length;
		int zeroIndex = -1;
		for (int i = 0; i < arrLen; i++) {
//			System.out.println("nums[" + i + "]: " + nums[i]);
			if (nums[i] == 0) {
//				System.out.println("i: "+i+" zeroIndex: "+zeroIndex);
				if (zeroIndex == -1) {
					zeroIndex = i;
//					System.out.println("zero Index is: "+zeroIndex);
				}
			} else {
				if (zeroIndex>=0 && nums[zeroIndex] == 0) {
//					System.out.println("I am in swap");
					nums[zeroIndex] = nums[i];
					nums[i] = 0;
					i--;
					zeroIndex = findNextZero(nums, i);
				}
			}

		}
		for (int i = 0; i < arrLen; i++) {
			System.out.println(nums[i]);
		}

	}

	private static int findNextZero(int[] nums, int i) {
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == 0) {
				return j;
			}
		}
		return -1;
	}
}

/*
Move Zeroes:

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

   Hide Hint #1
In-place means we should not be allocating any space for extra array. But we are allowed to modify the existing array.
 However, as a first step, try coming up with a solution that makes use of additional space.
 For this problem as well, first apply the idea discussed using an additional array and the in-place solution will pop up eventually.


   Hide Hint #2
A two-pointer approach could be helpful here. The idea would be to have one pointer for iterating the array and
another pointer that just works on the non-zero elements of the array.
 */