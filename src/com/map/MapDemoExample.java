package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemoExample {

	// create main method
	public static void main(String args[]) {
		// method calling
		new MapDemoExample().setMapObjectDetails();

	}

	private void setMapObjectDetails() {

		// creating the map object using HasMapclass

		/**
		 * syntax: Map<>key_Data_type, value_Data_type numbers = new HashMap<>();
		 *
		 */
		Map<String, String> bikeNames = new HashMap<>();
		// insert some values into map object
		bikeNames.put("YAMAHA", "MT15");
		bikeNames.put("ROYALENFIELD", "CLASSIC350");
		bikeNames.put("TVS", "RR310");
		bikeNames.put("HERO", "XPLUS");
		bikeNames.put("HONDA", "CBR");
		bikeNames.put("BAJAJ", "NS200");
		// Map.Engtry interface is providing all key and values for that map
		for (Map.Entry<String, String> map : bikeNames.entrySet()) {
			System.out.println(map.getKey() + "=" + map.getValue());
		}
	}

}
