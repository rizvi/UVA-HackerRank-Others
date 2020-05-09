package com.rizvi.leetcode.April2020;

import java.util.*;

/**
 * @author Rizvi on 4/22/2020
 * @project UVA-HackerRank-Others
 */
public class GroupAnagrams_2 {
	public static void main(String[] args) {
//		String[] arrStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
		String[] arrStrings = {"ate","eat", "tea"};
		System.out.println(groupAnagrams(arrStrings));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> parent;
		Map<String, List<String>> dataMap = new HashMap<>();
		int arrLen = strs.length;
		if (arrLen > 0) {
			dataMap = prepareDataMap(strs[0], strs[0], dataMap);
			for (int i = 1; i < strs.length; i++) {
				boolean isAnagram = checkAnagrams(strs[i - 1], strs[i]);
				if (isAnagram) {
					dataMap = prepareDataMap(strs[i - 1], strs[i], dataMap);
				} else {
					dataMap = prepareDataMap(strs[i], strs[i], dataMap);
				}
				System.out.println("" + strs[i - 1] + "   " + strs[i] + " anagram: " + isAnagram);
			}
		}
		parent = dataMapToDataList(dataMap);
		return parent;
	}

	private static List<List<String>> dataMapToDataList(Map<String, List<String>> dataMap) {
		return new ArrayList<List<String>>(dataMap.values());
	}

	private static Map<String, List<String>> prepareDataMap(String keyString, String valueString, Map<String, List<String>> dataMap) {
		if (dataMap.containsKey(keyString)) {
			List<String> dataList = dataMap.get(keyString);
			dataList.add(valueString);
			dataMap.put(keyString, dataList);
		} else {
			if (is_Value_Exists_In_The_Map_In_Other_Format_Key(dataMap, valueString)) {
			} else {
				List<String> dataList = new ArrayList<>();
				dataList.add(valueString);
				dataMap.put(keyString, dataList);
			}
		}

		return dataMap;
	}

	private static boolean is_Value_Exists_In_The_Map_In_Other_Format_Key(Map<String, List<String>> dataMap, String keyString) {
		for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
			boolean isAnagram = checkAnagrams(keyString, entry.getKey());
			if (isAnagram) {
				dataMap = prepareDataMap(entry.getKey(), keyString, dataMap);
				return true;
			}
		}
		return false;
	}


	private static boolean checkAnagrams(String str, String str1) {
		int firstStringLength = str.length();
		int secondStringLength = str1.length();
		if (firstStringLength == secondStringLength) {
			for (int i = 0; i < firstStringLength; i++) {
				Character ch = str.charAt(i);
				int firstStringOccurrenceTime = 0;
				int secondStringOccurrenceTime = 0;
				for (int j = 0; j < firstStringLength; j++) {
					if (str.charAt(j) == ch) {
						firstStringOccurrenceTime++;
					}
					if (str1.charAt(j) == ch) {
						secondStringOccurrenceTime++;
					}
				}
				if (firstStringOccurrenceTime != secondStringOccurrenceTime) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
}
