package com.project.basicdetails;

public class DemoMain {

	// sub method creation
	public int sub(int i, int j) { // (i=10, j=20)

		int k = i + j; // k = 10+20 = 30
		return k; // k = 30

	}

	public static void main(String args[]) {

		// crate the instance variables
		int i = 10;
		int j = 20;
		DemoMain demo = new DemoMain(); // object creation
		demo.sub(i, j); // method calling -> (10, 20)

		System.out.println("Sub values : " + demo.toString());
	}
}
