package com.arrays;

public class ForLoopArray {
	public static void main(String args[]) {
		new ForLoopArray().getLaptopNames();

	}
	// creating the instance method to create the array
	// i want to print the some laptop name using array concept

	public void getLaptopNames() {
		String LaptopName[] = new String[5];
		LaptopName[0] = "Lenovo";
		LaptopName[1] = "Hp";
		LaptopName[2] = "Dell";
		LaptopName[3] = "Asus";
		LaptopName[4] = "MSI";

		for (int i = 0; i < LaptopName.length; i++) {
			System.out.println(LaptopName[i]);
		}

	}

}
