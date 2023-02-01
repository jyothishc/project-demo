package com.interfaces;

//class implements interface
public class ProgrammingLanguage implements LanguageInterface {

	// implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language: " + name);
	}
}
