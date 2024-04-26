package basicJavaCodes;
public class AverageCalculation {
	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 3};
		int sum = 0;
		
		for (int number: numbers) {
			sum += number;
		}
		double average = (double) sum / numbers.length;
		System.out.println("Average: " + average);
	}
}
