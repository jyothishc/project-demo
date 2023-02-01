package com.operators;

public class NestedBreakLoop {

	public static void main(String args[]) {

		int product = 10;
		int selling = 7;

		// outer loop
		for (int i = 2; i <= product; ++i) {
			System.out.println("product: " + i);

			// inner loop
			for (int j = 2; j <= selling; ++j) {

				// break inside the inner loop
				if (i == 2) {
					break;
				}
				System.out.println(" selling:" + j);
			}
		}
	}
}
