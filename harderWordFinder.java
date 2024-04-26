package coding_practice;

import java.util.Scanner;

public class harderWordFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence:" );
		String sentence = input.nextLine();
		
		System.out.print("Enter the position (n): ");
		int n = input.nextInt();
		
		String[] words = sentence.split("");
		
		if (n== words.length -1) {
			System.out.println("There is no word at position" + n + ". ");
		} else if (n<words.length - 1) {
			String word = words[n];
			System.out.println("Word at position" + n + ":" + word);
		}else {
			System.out.println("Position" +n+ "is out of range");
			
			input.close();
		}
	}

}
