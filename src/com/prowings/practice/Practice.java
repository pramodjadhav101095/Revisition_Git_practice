package com.prowings.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<>();

		map.put("Maharashtra", Arrays.asList("Mumbai", "Pune"));

//		Map<String, String> cityToState = new HashMap<>();
//		cityToState.put("Mumbai", "Maharashtra");
//		cityToState.put("Pune", "Maharashtra");
//		cityToState.put("Los Angeles", "California");
//		cityToState.put("San Francisco", "California");
//		cityToState.put("Dallas", "Texas");
//		cityToState.put("Houston", "Texas");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a city or state name:");

		String input = sc.nextLine();
		sc.close();
		
		
		 if (map.containsKey(input)) {
	            System.out.println("State '" + input + "' has cities: " + map.get(input));
	        } else {
	            // Use an iterator to search for the city
	            boolean found = false;
	            Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
	            
	            while (iterator.hasNext()) {
	                Map.Entry<String, List<String>> entry = iterator.next();
	                String state = entry.getKey();
	                List<String> cities = entry.getValue();

	                // Check if the city list contains the input city
	                if (cities.contains(input)) {
	                    System.out.println("City '" + input + "' is in state: " + state);
	                    found = true;
	                    break;
	                }
	            }

	            // If neither a state nor city was found
	            if (!found) {
	                System.out.println("No match found for: " + input);
	            }
	        }
	}

}
