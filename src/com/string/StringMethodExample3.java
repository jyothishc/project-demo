package com.string;

public class StringMethodExample3 {
	
	public static void main(String args[]) {
		String empName = "Balraj";
		String empDept = "Voluntary";
		StringMethodExample3 str = new StringMethodExample3();
		str.checkDetails(empName, empDept);
		
		
	}
	//creating non static method
	private void checkDetails(String empName, String empDept) {
		//length(), replace(), toLowerCase(),toUpperCase()
		
		System.out.println(empName.length());
		System.out.println(empDept.replaceAll("Voluntary", "IT"));
		System.out.println(empName.toLowerCase());
		System.out.println(empDept.toUpperCase());
	}

}
