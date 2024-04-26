package basicJavaCodes;
public class LinearSearch {
	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 3};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
	}
}
