package com.operators;

public class AdditionOperator {
	String homeTownName = "Galiveedu";

	// creating main method
	public static void main(String args[]) {
		// instance variables
		int i = 30;

		boolean house = true;
		int j = 20;
		char nickName = 'G';

		int add = addition(i, j); // static method
		System.out.println("Addition ::" + add);
		// object creation
		AdditionOperator addition = new AdditionOperator();
		String s = addition.multiplicateOperator(i, j); // instance method calling
		System.out.println("I want HomeTownName" + s);

	}

	private static int addition(int i, int j) { // method decleration

		int a = i + j;
		return a;
	}

	private String multiplicateOperator(int i, int j) {

		int mul = i * j;

		System.out.println("Multiplicate :: " + mul);
		int div = i % j;
		System.out.println("Divison :: " + div);
		
		int sub = i - j;

		System.out.println("Subtraction ::" + sub);

		String str = homeTownName;
		return str;

	}
}
