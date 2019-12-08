package com.rizvi.leetcode.p1207;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

class Solution {
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : arr) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}

		// displaying the occurrence of elements in the arraylist
		for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
			System.out.println("Element " + val.getKey() + " "
					+ "occurs"
					+ ": " + val.getValue() + " times");
		}
		int size = hm.size();
		System.out.println("size: " + size);
		long count = hm.values().stream().distinct().count();
		System.out.println("count: " + count);
		int countIntVal = (int) count;
		System.out.println("countIntVal: " + countIntVal);
		if (size == countIntVal) {
			return true;
		}
		return false;
	}
}