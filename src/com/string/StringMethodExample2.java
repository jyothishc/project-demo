package com.string;

public class StringMethodExample2 {
	
	public static void main(String args[]) {
		
		String s = "hello";
		String s1 = "HELLO";
		String s2 = "JYOTHEESH";
		String s3 = "jyotheesh";
		String s4 = "Hi";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		checkTwoStringValues(s,s1);//static method calling
		
		StringMethodExample2 str = new StringMethodExample2();
		str.checkStringValues(s,s2,s3,s4); //non static method calling
		
	}
	//static method creation
	private static void checkTwoStringValues(String s,String s1) {

		if(s.equals(s1)) {
			System.out.println("s and s1 both are having same data...");
		}else {
			System.out.println("s and s1 both are not having same data...");
		}
	}
		//non static method creation
		private void checkStringValues(String s, String s2,String s3,String s4) {
			if(s.equals(s4)) {
				System.out.println("s and s4 both are having same data...");
			}else if(s2.equalsIgnoreCase(s3)) {
				System.out.println("s3 and s4 both are having same data...");
			}else {
				System.out.println("No matching data.........");
			
			
				
			}
		}
	
	
	}


