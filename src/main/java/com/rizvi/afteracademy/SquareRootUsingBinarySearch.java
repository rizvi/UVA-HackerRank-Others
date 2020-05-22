package com.rizvi.afteracademy;

import java.util.Scanner;

/**
 * @author Rizvi on 5/22/2020
 * @project UVA-HackerRank-Others
 */
public class SquareRootUsingBinarySearch {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int data = inp.nextInt();
		System.out.println(intSqrt(data));
	}

	public static int intSqrt(int num) {
		// write your awesome code here
		return getSquareRoot(num);
	}

	public static int getSquareRoot(int N) {
		if (N == 0 || N == 1) {
			return N;
		}

		int start = 1;
		int end = N;

		int squareRoot = 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if ((mid * mid) == N)
				return mid;
			if ((mid * mid) < N) {
				start = mid + 1;
				squareRoot = mid;
			} else
				end = mid - 1;
		}
		return squareRoot;
	}
}
