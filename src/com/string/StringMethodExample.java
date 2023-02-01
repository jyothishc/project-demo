package com.string;

public class StringMethodExample {
	
	public static void main(String args[]) {
		
		//contact() method
		String str ="Balu";
		System.out.println(str);
		
		String str1 = str.concat("Raju");
		System.out.println(str1);
		
		//contain() method
		StringMethodExample s = new StringMethodExample();
		s.show(str1);
		
	}
	private void show(String str1) {
		if (str1.contains("Rajubabu")) {
			System.out.println("Yes Raju name is available......");
		}else {
			System.out.println();
			
		}
	}

}
