package com.string;

public class StringInterViewerQuestion {
	
	public static void main(String args[]) {
		
		String s = "Good";
		String s1 = "Good";
		
		if(s==s1) {
			System.out.println("It is creating inside s.c.p");
		}else {
			System.out.println("It is creating inside Heap");
		}
		String str = new String("Good");
		String str1 = new String("Good");
		
		System.out.println(s==str);
		System.out.println(s==str1);
		System.out.println(str.equals(str1));
		
		
	}

}
