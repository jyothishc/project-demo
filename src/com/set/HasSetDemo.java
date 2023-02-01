package com.set;

import java.util.HashSet;

public class HasSetDemo {

	public static void main(String args[]) {

		// create a HasSet object called numbers
		HashSet<Integer> numbers = new HashSet<Integer>();

		// Add values to the set
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);

		// show which numbers between 1and 10 are in the set

		for (int i = 1; i <= 10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + "was found in the set.");
			} else {
				System.out.println(i + "was not found in the set.");
			}
		}

	}

}
