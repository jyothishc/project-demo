package com.string;

public class TwoStringCompare {

	public static void main(String args[]) {

		// create three Strings
		String first = "java programming";
		String second = "core java";
		String third = "java programming";

		// compare first and second string
		boolean result1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + result1);

		// compare first and third Strings
		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equals: " + result2);

	}

}
