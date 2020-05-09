package com.rizvi.leetcode.April2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Rizvi on 4/23/2020
 * @project UVA-HackerRank-Others
 */
public class CountingElements {
	public static void main(String[] args) {
//		int arr[] = {1, 2, 3};
//		int arr[] = {1, 3, 2, 3, 5, 0};
//		int arr[] = {1,1,3,3,5,5,7,7};
		int arr[] = {1, 10, 7, 15, 12, 15, 13, 10, 3, 16, 2, 2, 10, 2, 16, 9};
//		int arr[] = {1,1,2,2};
		System.out.println(countElements(arr));
	}

	public static int countElements(int[] arr) {
		HashMap<Integer, Integer> countDuplicateMap = new HashMap<>();
		HashSet<Integer> dataSet = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			if (dataSet.add(arr[i]) == false) {
				if (countDuplicateMap.get(arr[i]) == null) {
					countDuplicateMap.put(arr[i], 1);
				} else {
					countDuplicateMap.put(arr[i], countDuplicateMap.get(arr[i]) + 1);
				}
			} else {
				countDuplicateMap.put(arr[i], 1);
			}
		}

		int count = 0;
		Integer[] dataArray = dataSet.toArray(new Integer[dataSet.size()]);
		Arrays.sort(dataArray);
		for (int i = 1; i < dataArray.length; i++) {
			if (dataArray[i] == dataArray[i - 1] + 1) {
				int firstDataCount = countDuplicateMap.get(dataArray[i - 1]);
				int secondDataCount = countDuplicateMap.get(dataArray[i]);
				System.out.println("first data("+dataArray[i - 1]+") count is: " + firstDataCount + ", Second Data("+dataArray[i]+") Count: " + secondDataCount);
				if (secondDataCount > firstDataCount) {
					count = count + Integer.min(secondDataCount, firstDataCount);
				} else {
					count = count + Integer.max(secondDataCount, firstDataCount);
				}
				System.out.println("count: " + count);
			}
		}
		return count;
	}
}
