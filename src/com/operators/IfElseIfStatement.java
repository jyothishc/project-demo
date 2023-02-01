package com.operators;

public class IfElseIfStatement {
	int s;

	// main method
	public static void main(String args[]) {

		// variables declaration

		int i = 5;
		int j = 9;
		int k = 6;
		int l = 7;

		// if else if statement

		if (i <= j || i == j) {
			System.out.println("if else if condition statement is true");
		} else if (k < l && k > l) {
			System.out.println("First else if condition statement is true ");
		} else if (j > l) {
			System.out.println("second else if condition is true");
		} else {

			System.out.println("All if and else if condition not true");

		}
	}

}
