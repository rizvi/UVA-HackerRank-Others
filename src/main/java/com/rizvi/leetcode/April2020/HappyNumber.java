package com.rizvi.leetcode.April2020;

import java.util.HashMap;

/**
 * @author Rizvi on 4/19/2020
 * @project UVA-HackerRank-Others
 */
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(7));
	}

	public static boolean isHappy(int n) {
		String inp = String.valueOf(n);
		int inputLength = inp.length();
		char[] strings = inp.toCharArray();
		HashMap<Integer, Integer> memo = new HashMap<>();
		int sum = getSummationOfString(strings, memo);
		System.out.println("sum: " + sum);
		if (sum == 1) return true;
		return false;
	}

	private static int getSummationOfString(char[] strings, HashMap<Integer, Integer> memo) {
		int charLength = strings.length;
		System.out.println("character length: " + charLength);
		int summation = 0;
		for (int i = 0; i < charLength; i++) {
			summation = summation + Character.getNumericValue(strings[i]) * Character.getNumericValue(strings[i]);
		}
		if (memo.get(summation) == null) {
			memo.put(summation, 1);
		} else {
			System.out.println("I am here: " + summation);
			return summation;
		}
		System.out.println("summation is: " + summation);
		if (summation == 1) {
			return summation;
		} else {
			summation = getSummationOfString(String.valueOf(summation).toCharArray(), memo);
		}
		return summation;
	}
}

/*
Happy Number

Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits,
 and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1


 */