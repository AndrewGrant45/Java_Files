package basicJavaCodes;
public class ArrayManipulations {
	public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3}; // List of numbers

        // Finding the maximum number in the list
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);

        // Calculating the sum of all numbers in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

        // Printing the array in reverse order
        System.out.print("Reversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}