package com.interfaces;

public class Square implements PolygonInterface {

	public void getArea() {
		int length = 5;
		int area = length * length;
		System.out.println("The area of Square is " + area);

	}

}
