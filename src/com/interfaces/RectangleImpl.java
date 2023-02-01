package com.interfaces;

public class RectangleImpl implements PolygonInterface {

	public void getArea() {
		int length = 6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("the area of the rectangle is " + area);

	}

	// overrides the getSides
	public void getSides() {
		System.out.println("i have 4 sides.");
	}

}
