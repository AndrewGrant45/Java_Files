package basicJavaCodes;

import java.util.Scanner;

public class NumberSwap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number A: ");
		int a = input.nextInt();
		System.out.println("Enter number B: ");
		int b = input.nextInt();
		
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping: a = " + a + " , b = " + b);
		
		input.close();
	}
}
