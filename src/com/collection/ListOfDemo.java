package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOfDemo {

	public static void main(String args[]) {
		new ListOfDemo().printListOfName();

	}

	// instance method
	public void printListOfName() {

		// creating the List object
		//Syntax : Interface_Name<Data_type/User Object> variable_Name = new Implementaion_Class_Name<>();
		List<String> listOfNames = new ArrayList<>();
		// add the values in List Interface
		listOfNames.add("Afridi");
		listOfNames.add("Rasheed");
		listOfNames.add("Dumbu");
		listOfNames.add("Vijay");
		listOfNames.add("Sai");
		listOfNames.add("Jyotheesh");

		System.out.println("My Friends Names :: " + listOfNames);
		System.out.println("List Size :: " + listOfNames.size());
		System.out.println(listOfNames.remove(5));
		System.out.println("After remove the Jyotheesh Name :: " + listOfNames);
		System.out.println("Get the List data :: " + listOfNames.get(2));
	}

}
