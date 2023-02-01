package com.arrays;

public class MultiDimArrayDemo {
	public static void main(String args[]) {
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "jones" } };
		// Mr.smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms.jones
		System.out.println(names[0][2] + names[1][1]);
	}

}
