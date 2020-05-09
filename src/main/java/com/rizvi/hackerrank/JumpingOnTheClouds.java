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
public class JumpingOnTheClouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		if (c.length <= 3) return 1;
		for (int i = 0; i < c.length; i++) {
			if (i == 0) {
				i = i + 2;
			} else {
				i = i + 1;
			}
			if (i == c.length) {
//				System.out.println("I am here now");
				count = count + 1;
				return count;
			}
//			System.out.println("c[" + i + "]: " + c[i]);
			if (c[i] == 1) {
				i = i - 1;
				count++;
			} else {
				count++;
			}
			if (i == 0) count = 0;
//			System.out.println("count: " + count);
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

		System.out.println("result: " + result);
/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();*/
	}
}
