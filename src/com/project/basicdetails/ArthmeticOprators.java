package com.project.basicdetails;

public class ArthmeticOprators {

	// creating main method
	public static void main(String args[]) {

		int j = 33;
		int i = 39;

		// object creation syntax: object_name/class_name variable_name
		// =object_name/class_name();

		ArthmeticOprators arthOperator = new ArthmeticOprators();
		int z = arthOperator.add(i, j);

		int z1 = arthOperator.sub(j, i);

		int z2 = arthOperator.div(3, 6);

		int z3 = arthOperator.mul(20, 10);

		System.out.println("print the z value " + z);
		System.out.println("print the z1 value " + z1);
		System.out.println("print the z2 value " + z2);
		System.out.println("print the z3 value " + z3);

		System.out.println("print the % value " + 10 % 20);

	}

	// non static method
	private int add(int i, int j) {

		return i + j;
	}

	// non static method
	private int sub(int j, int i) {

		return j - i;
	}

	// non static method
	private int div(int i, int j) {

		return i / j;

	}

	// non static method
	private int mul(int j, int i) {
		return j * i;
	}

}
