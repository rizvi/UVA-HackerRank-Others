package com.rizvi.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author Rizvi on 5/21/2020
 * @project UVA-HackerRank-Others
 */
public class CountingValleys {
	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int counter = 0;
		int valley = 0;

		Character uphill = new Character('U');
		Character downhill = new Character('D');

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (uphill.equals(c)) {
				counter++;
			} else if (downhill.equals(c)) {
				counter--;
				if (counter == -1) {
					valley++;
					System.out.println("valley: " + valley);
				}
			}
			System.out.println("counter: " + counter);
		}
		return valley;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println("result is: " + result);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();
	}
}
