package com.rizvi.leetcode.April2020;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rizvi on 4/18/2020
 * @project UVA-HackerRank-Others
 */
public class SingleNumber {
	public static void main(String[] args) {
		int arr[] = {2, 3, 2, 3, 1, 5, 1};
		System.out.println("single number is: " + singleNumber(arr));
	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> dataMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			if (dataMap.get(nums[i]) != null) {
				if (dataMap.get(nums[i]) > 0) {
					dataMap.put(nums[i], dataMap.get(nums[i]) + 1);
				} else {
					System.out.println(dataMap.get(nums[i]));
					dataMap.put(nums[i], dataMap.get(nums[i]) + 1);
				}
			} else {
				dataMap.put(nums[i], 1);
			}
		}
		for (Map.Entry m : dataMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			if (Integer.parseInt(m.getValue().toString()) == 1) {
				return Integer.parseInt(m.getKey().toString());
			}
		}
		return 0;
	}
}

/*
Single Number

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

Example 2:

Input: [4,1,2,1,2]
Output: 4

 */