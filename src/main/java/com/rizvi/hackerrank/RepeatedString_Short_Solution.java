package com.rizvi.hackerrank;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Rizvi on 5/21/2020
 * @project UVA-HackerRank-Others
 */
public class RepeatedString_Short_Solution {

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

	private static long repeatedString(String s, long n) {
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

		long A = 0l;
		long B = 0l;
		for (int i = 0; i < strLength; i++) {
			if (i < remainder) {
				System.out.println("is it a: "+(s.charAt(i) ^ 'a'));
				if ((s.charAt(i) ^ 'a') == 0) {
					A++;
					B++;
				}
			} else {
				if ((s.charAt(i) ^ 'a') == 0) {
					A++;
				}
			}

		}
		return A * quotient + B;
	}

}
