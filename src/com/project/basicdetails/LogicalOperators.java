package com.project.basicdetails;

public class LogicalOperators {

	public static void main(String args[]) {

		// logical operators &&, ||,!
		int i = 12;
		int j = 30;
		// syntax: condition_1 && condition_2=> (true && true) => output: true
		System.out.println(i < j && i > j); // ((12<30 && 12>30)) -> (true &&false) => false
		System.out.println(3 < 6 && 9 > 5); // ((3<6 && 9>5))-> (true && true) => true

		/*
		 * Syntax: condition_1 || condition_2 (true || false) =>output:true (false
		 * ||true) =>output:true (false ||false) =>output:false (true ||true)
		 * =>output:true
		 */
		System.out.println(i < j || i > j); // ((12<30 || 12>30)) ((true ||false))=>output:true
		System.out.println(3 < 6 && 9 > 5); // ((true ||true)) =>output:true
		

		System.out.println("========Bitwise AND(&), OR(|) Operator=========");
		System.out.println(8 < 9 & 6 > 1); // ((true & true))=>true
		System.out.println(i < j | i > j);// ((true | false))=>true

		// logical NOT (i)
		System.out.println("=========Logical NOT (!)========");
		System.out.println(!true);// false
		System.out.println(!false);// true

		System.out.println(!(j > i));
		System.out.println(!(i > j));

	}

}
