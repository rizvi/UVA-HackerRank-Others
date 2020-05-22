package com.rizvi.afteracademy;

import java.util.Scanner;

/**
 * @author Rizvi on 5/22/2020
 * @project UVA-HackerRank-Others
 */
public class ReverseBits {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int data = inp.nextInt();
		System.out.println(reverseBits(data));
	}

	public static int reverseBits(int num) {
		String binaryData = Integer.toBinaryString(num);
		int reverseBinaryData = reverseData(Integer.parseInt(binaryData));
		int reverseBits = Integer.parseInt(String.valueOf(reverseBinaryData), 2);
		return reverseBits;
	}

	private static int reverseData(int num) {
		int reversed = 0;

		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
	}

}
