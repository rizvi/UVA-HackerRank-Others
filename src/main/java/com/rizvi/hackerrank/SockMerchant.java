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
public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int pairNumber = 0;
		HashMap<Integer, Integer> dataMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (null != dataMap.get(ar[i])) {
				int numberOfData = dataMap.get(ar[i]);
				numberOfData++;
				if (numberOfData == 2) {
					pairNumber++;
					numberOfData = 0;
				}
				dataMap.put(ar[i], numberOfData);
			} else {
				dataMap.put(ar[i], 1);
			}
		}

		return pairNumber;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(result);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

//		scanner.close();
	}
}
