package basicJavaCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContains {
	 public static void main(String[] args) {
	        List<String> countries = new ArrayList<>();
	        countries.add("USA");
	        countries.add("Canada");
	        countries.add("India");

	        String countryToCheck = "India";

	        // Checking if an element exists in the ArrayList
	        if (countries.contains(countryToCheck)) {
	            System.out.println(countryToCheck + " exists in the list.");
	        } else {
	            System.out.println(countryToCheck + " does not exist in the list.");
	        }
	    }
}
