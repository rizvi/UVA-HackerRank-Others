package com.rizvi.afteracademy;// Program to convert Roman Numerals to Numbers

import java.util.*;

public class RomanToNumber {
	// This function returns value of a Roman symbol
	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	// Finds decimal value of a given roman numeral
	int romanToDecimal(String str) {
		// Initialize result
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			// Getting value of symbol s[i]
			int s1 = value(str.charAt(i));

			// Getting value of symbol s[i+1]
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));

				System.out.println("s1 is: " + s1);
				System.out.println("s2 is: " + s2);
				System.out.println("#########");

				// Comparing both values
				if (s1 >= s2) {
					// Value of current symbol is greater
					// or equal to the next symbol
					result = result + s1;
				} else {
					result = result + s2 - s1;
					i++; // Value of current symbol is
					// less than the next symbol
				}
			} else {
				result = result + s1;
				i++;
			}
		}
		return result;
	}

	// Driver method
	public static void main(String args[]) {
		RomanToNumber ob = new RomanToNumber();

		// Considering inputs given are valid
//		String str = "MCMIV";
//		String str = "MCMXCV";
		String str = "MCMXCIX";
		System.out.println("Integer form of Roman Numeral" +
				" is " + ob.romanToDecimal(str));
	}
}
