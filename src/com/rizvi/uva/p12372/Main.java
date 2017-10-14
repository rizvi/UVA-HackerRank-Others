package com.rizvi.uva.p12372;

import java.util.Scanner;

/**
 * @Problem: UVA 12372
 * @Name: Mr. Bean's [Packing for Holiday]
 * @Type: Mathematics conditional
 * @author Abu Zakir Rizvi
 * 
 */
class Main {
	public static void main(String[] args) {
		new UVa_12372_Solution().solve();
	}
}

class UVa_12372_Solution {
	final private Scanner inp = new Scanner(System.in);
	private int no_of_test_cases, h, w, l;

	public void solve() {
		no_of_test_cases = inp.nextInt();

		for (int i = 1; i <= no_of_test_cases; i++) {
			l = inp.nextInt();
			w = inp.nextInt();
			h = inp.nextInt();

			System.out.print("Case " + i + ": ");
			if (l > 20 || w > 20 || h > 20)
				System.out.println("bad");
			else
				System.out.println("good");
		}
	}
}