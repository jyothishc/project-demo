package com.accessmodifier;

public class ParentDemo {
	
	protected String MyPosition = "BackendDev";
	
	protected void show() {
		System.out.println("This is Parent Class. .");
	
	}
	
	//creating main method
	public static void main(String args[]) {
		//creating the Demo object
		Demo demo = new Demo();
		demo.myWork();
	}

}
