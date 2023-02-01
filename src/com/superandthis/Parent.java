package com.superandthis;

public class Parent {
	
	public Parent() {
		System.out.println("Hi this is Parent Class Construcor....");
		
	}
	int i = 10;
	String myCompanyName = "CG";
	
	//instance method
	public String getMyCompanyName(String myCompanyName) {
		System.out.println("My CompanyName :: "+myCompanyName);
		return myCompanyName;
		
	}

}
