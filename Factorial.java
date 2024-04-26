package basic_Level;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your factorial:");
		int a = input.nextInt();
		
		input.close();
		
		long factorial = calculateFactorial(a);
		System.out.println("Factorial of " + a + " is: " + factorial);
	}
	// Long is a data type value that can hold 64-bit integer values
	public static long calculateFactorial(int n) {
		if( n == 0 || n == 1) {
			return 1;
		}else {
			return n * calculateFactorial(n-1);
		}
	}	
}
