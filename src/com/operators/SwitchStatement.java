package com.operators;

public class SwitchStatement {
	
	//main method creation
	public static void main(String args[]) {
		
		//string variable creation
		String myBikeName = "Yamaha Rx 100";
		int a=12;
		//creating the static method about switch Statement logic
		matchingBikeNames(myBikeName); //method calling{
		matchingBikeNames1(myBikeName); //method calling{
		
		show(a);
		System.out.println("Hi Jyothis");
	}
	
	   //creating static method, matchingNames
		private static void matchingBikeNames(String myBikeName) {
			
		//creating the switch statement
		System.out.println("entre into the matchingBikeNames method");
		switch(myBikeName) {
		case "R15":
			System.out.println("my Bike Name is R15");
			break;
		case "Himalayan":
			System.out.println("my BikeName is Himalayan");
		case "Duke":
			System.out.println("my BikeName is Duke");
		case "Yamaha Rx 100":
			System.out.println("my BikeName is Yamaha Rx 100");
			default:
				System.out.println("Default my BikeName");
		}
		
	}
		
		private static void matchingBikeNames1(String myBikeName) {
			
			//creating the switch statement
			System.out.println("entre into the matchingBikeNames method");
			switch(myBikeName) {
			case "R15":
				System.out.println("my Bike Name is R15");
				break;
			case "Himalayan":
				System.out.println("my BikeName is Himalayan");
			case "Duke":
				System.out.println("my BikeName is Duke");
			case "Yamaha Rx 100":
				System.out.println("my BikeName is Yamaha Rx 100");
				default:
					System.out.println("Default my BikeName");
			}
			
		}
		
		private static int show(int a) {
			System.out.println("in side show()");
			int b=a;
			return b;
		}

}
