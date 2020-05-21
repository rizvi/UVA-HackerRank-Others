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
public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		return initialize(s, n);

	}

	private static long initialize(String s, long n) {
		int strLength = s.length();
		System.out.println("strLength: " + strLength);
		if (strLength > 100) {
			System.out.println("return strLength");
			return 0;
		}

		if (n > 1000000000000l) {
			System.out.println("return actual length");
			return 0;
		}
		long quotient = n / strLength; // quotient = numberOfPartition
		System.out.println("quotient: " + quotient);

		long remainder = n % strLength;
		System.out.println("remainder: " + remainder);

		HashMap<Character, Long> divisorMap = prepareDivisorMap(s);
		divisorMap.forEach((key, value) -> {
			value = value * quotient;
			divisorMap.put(key, value);
			//System.out.println("Key : " + key + " Value : " + value);
		});

		String remainingString = prepareRemainingString(s, remainder);
		HashMap<Character, Long> divisorMapFull = new HashMap<>();
		if (remainder > 0) {
			divisorMapFull = prepareDivisorMap(remainingString, divisorMap);
			divisorMapFull.forEach((key, value) -> {
				System.out.println("Key : " + key + " Value : " + value);
			});
			// For checking max value from full collections
//			return Collections.max(divisorMapFull.values());

			// For checking only number of a
			return divisorMapFull.get('a') == null ? 0 : divisorMapFull.get('a');
		}
        // For checking max value from full collections
//		return Collections.max(divisorMap.values());

		// for checking only number of a
		return divisorMap.get('a') == null ? 0 : divisorMap.get('a');
	}

	private static HashMap<Character, Long> prepareDivisorMap(String remainingString, HashMap<Character, Long> divisorMap) {
		HashMap<Character, Long> newDivisorMap = divisorMap;
		for (int i = 0; i < remainingString.length(); i++) {
			long newLengthOfString = newDivisorMap.get(remainingString.charAt(i)) + 1;
			newDivisorMap.put(remainingString.charAt(i), newLengthOfString);
		}
		return newDivisorMap;
	}

	private static String prepareRemainingString(String s, long remainder) {
		StringBuilder sb = new StringBuilder();
		sb = sb.append(s.substring(0, Math.toIntExact(remainder)));
		return sb.toString();
	}

	private static HashMap<Character, Long> prepareDivisorMap(String fullString) {
		HashMap<Character, Long> divisorMap = new HashMap<>();
		HashSet<Character> dataSet = new HashSet();
		for (int i = 0; i < fullString.length(); i++) {
			if (dataSet.add(fullString.charAt(i)) == false) {
				if (divisorMap.get(fullString.charAt(i)) == null) {
					divisorMap.put(fullString.charAt(i), 1l);
				} else {
					long newLengthOfString = divisorMap.get(fullString.charAt(i)) + 1;
					divisorMap.put(fullString.charAt(i), newLengthOfString);
				}
			} else {
				divisorMap.put(fullString.charAt(i), 1l);
			}
		}
		return divisorMap;
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

/*
Hacker Rank problem: https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
d
590826798023

epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq
549382313570
 */
