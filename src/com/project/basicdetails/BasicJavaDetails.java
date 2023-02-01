package com.project.basicdetails;

public class BasicJavaDetails {
	// syntax for how to create the static variable
	// syn:- static data_type variable_name = value;
	static int s = 90; // static varibale

	// method creation
	void show() {

		// syn:- data_type variable_name = value;
		int j = 200; // local variable

		System.out.println("print the value into show method" + j);

	}

	public static void main(String arg[]) { // main method
		// syn:- data_type variable_name =value;
		int i = 369; // instance variable

		System.out.println("Values I " + i); // print method

		String myName = "Jyotheesh"; // syn:- data_type variabl_name = value;

		System.out.println("my Name is " + myName);
	}
}
