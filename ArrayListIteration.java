package basicJavaCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIteration {
	 public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Iterating using for-each loop
	        System.out.println("Using for-each loop:");
	        for (int number : numbers) {
	            System.out.println(number);
	        }

	        // Iterating using traditional for loop
	        System.out.println("Using traditional for loop:");
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }
	    }
}
