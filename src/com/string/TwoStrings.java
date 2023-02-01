package com.string;

public class TwoStrings {

	public static void main(String args[]) {

		// creating first String
		String first = "java";
		System.out.println("First String: " + first);

		// create second
		String second = "Programming";
		System.out.println("Second String: " + second);

		// join two Strings
		String joinedString = first.concat(second);
		System.out.println("Joined String: " + joinedString);
	}

}
