package com.rizvi.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author Rizvi on 5/4/2020
 * @project UVA-HackerRank-Others
 */
public class RepeatedString_TLE {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		String fullString = prepareFullString(s, n);
		//System.out.println("fullString is: " + fullString);

		HashMap<Character, Integer> countDuplicateMap = new HashMap<>();
		HashSet<Character> dataSet = new HashSet();
		int count = 1;
		for (int i = 0; i < fullString.length(); i++) {
			if (dataSet.add(fullString.charAt(i)) == false) {
				if (countDuplicateMap.get(fullString.charAt(i)) == null) {
					countDuplicateMap.put(fullString.charAt(i), 1);
					if(1 > count) count = 1;
				} else {
					int newLengthOfString = countDuplicateMap.get(fullString.charAt(i)) + 1;
					countDuplicateMap.put(fullString.charAt(i), newLengthOfString);
					if(newLengthOfString > count) {
						count = newLengthOfString;
					}
				}
			} else {
				countDuplicateMap.put(fullString.charAt(i), 1);
				if(1 > count) count = 1;
			}
		}
		return count;

	}

	private static String prepareFullString(String s, long n) {
		int strlength = s.length();
		long numberOfPartition = n / strlength;
		System.out.println("numberOfPartition: " + numberOfPartition);
		long remaining = n % strlength;
		System.out.println("Remaining: " + remaining);
		String newString = "";
		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < numberOfPartition; i++) {
			sb = sb.append(s);
		}
		sb = sb.append(s.substring(0, Math.toIntExact(remaining)));
		return sb.toString();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println("result: " + result);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();
	}
}
