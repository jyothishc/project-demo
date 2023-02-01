package com.interfaces;

public interface PolygonInterface {

	void getArea();

	// default method
	default void getSides() {
		System.out.println("I can get sides of a polygon.");

	}

}
