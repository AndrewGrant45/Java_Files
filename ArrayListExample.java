package basicJavaCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// Creating an ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements in the ArrayList
        System.out.println("Fruits: " + fruits);

        // Getting the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());

        // Accessing an element by index
        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        // Modifying an element
        fruits.set(2, "Grapes");
        System.out.println("Updated fruits: " + fruits);

        // Removing an element
        fruits.remove(0);
        System.out.println("Updated fruits after removal: " + fruits);
	}
}
