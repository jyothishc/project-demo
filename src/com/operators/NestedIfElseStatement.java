package com.operators;

public class NestedIfElseStatement {
	
	public static void main(String args[]) {
		
		//declaring double type variables
		Double j1= 3.1, j2 = 3.2, j3 = 3.3,largest;
		
		//checks if j1>=j2
		if (j1>=j2) {
			//if else statement inside the if block
			//check if j1>=j3
			if (j1>=j3) {
				largest = j1;
				
			}
			else {
				largest = j3;
			}
		}else {
			//if else statement inside else block
			//check if j2>=j3
			if (j2<=j3) {
				largest =j2;
				
			}
			else {
				largest = j3;
			}
		}
		System.out.println("Largest Number: "+largest);
				
	}

}
