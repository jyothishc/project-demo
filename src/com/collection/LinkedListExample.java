package com.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String args[]) {

		// LinkedList Declaration
		LinkedList<String> linkedlist = new LinkedList<>();

		linkedlist.add("Apple");
		linkedlist.add("Orange");
		linkedlist.add("Mango");

		// for loop
		System.out.println("**For Loop**");
		for (int num = 0; num < linkedlist.size(); num++) {
			System.out.println(linkedlist.get(num));
		}

	}

}
