package com.rizvi.leetcode.April2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Rizvi on 4/22/2020
 * @project UVA-HackerRank-Others
 */
public class GroupAnagrams {
	public static void main(String[] args) {
		String[] arrStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
//		String[] arrStrings = {"ate","eat", "tea"};
		System.out.println(groupAnagrams(arrStrings));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> groupedAnagrams = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for(String current : strs) {
			char[] characters = current.toCharArray();
			Arrays.sort(characters);
			String sorted = new String(characters);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(current);
		}
		groupedAnagrams.addAll(map.values());
		return groupedAnagrams;
	}
}

/*
Best Solution: https://www.youtube.com/watch?v=ptgykfAEax8
 */