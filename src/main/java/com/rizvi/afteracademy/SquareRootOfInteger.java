package com.rizvi.afteracademy;

import java.util.Scanner;

/**
 * @author Rizvi on 5/22/2020
 * @project UVA-HackerRank-Others
 */
public class SquareRootOfInteger {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int data = inp.nextInt();
		System.out.println(intSqrt(data));
	}

	public static int intSqrt(int num) {
		// write your awesome code here
		return (int)(Math.sqrt(num));
	}
}
