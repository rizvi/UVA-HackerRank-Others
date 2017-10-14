package com.rizvi.uva.p12149;

import java.util.Scanner;

/**
 * @Problem: UVA 12149
 * @Name: Feynman
 * @Type: Mathematics ( 1^2 + 2^2 + .... + n^2 )
 * @author Abu Zakir Rizvi
 * 
 */
class Main {
	public static void main(String[] args) {
		new UVa_12149_Solution().solve();
	}
}

class UVa_12149_Solution {
	final private Scanner inp = new Scanner(System.in);
	private int no_of_grid;

	public void solve() {
		for (;;) {
			no_of_grid = inp.nextInt();
			int n = no_of_grid;
			if (n == 0)
				break;
			System.out.println((n * (n + 1) * ((2 * n) + 1)) / 6);
		}
	}
}
