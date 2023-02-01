package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {
     // create main method
	public static void main(String args[]) {

		// create a map
		Map<String, String> company_Managers = new HashMap<>();

		// assign values to the map
		company_Managers.put("GOOGLE", "DUMBU");
		company_Managers.put("IBM", "VIJAY");
		company_Managers.put("CAPGEMINI", "AFRIDI");
		company_Managers.put("CONGNIZANT", "RASHEED");
		company_Managers.put(null, "JYOTHEESH");
		company_Managers.put("WIPRO", null);

		String value = company_Managers.get("IBM");// get method
		System.out.println("key = IBM,value : " + value);

		value = company_Managers.getOrDefault("WIPRO", "Default Value"); // get or default method
		System.out.println("key = WIPRO,Value : " + value);

		boolean keyExists = company_Managers.containsKey(null);
		boolean valueExists = company_Managers.containsValue("JYOTHEESH");

		System.out.println("null keyExists : " + keyExists + ", null valueExists : " + valueExists);

		Set<Entry<String, String>> entrySet = company_Managers.entrySet(); // entry set
		System.out.println("entryset for the company_Managers : " + entrySet);

		System.out.println("size of company_Managers : " + company_Managers.size()); 

		Map<String, String> data_Managers = new HashMap<>();
		data_Managers.putAll(company_Managers); // putAll method
		System.out.println("data_Managers mapped to company_managers : data_Managers");

		Set<String> KeySet = company_Managers.keySet();
		System.out.println("data_Managers keys : " + KeySet);

		Collection<String> values = company_Managers.values();
		System.out.println("data managers values : " + values);

		company_Managers.clear();
		System.out.println("data Managers after clear operation, is empty : " + company_Managers.isEmpty());

	}
}
