package coding_practice;

public class FindTheWord {
	public static void main(String[] args) {
			String input = "I love Codecademy"; // Input string

	        // Split the input string into words
	        String[] words = input.split(" ");

	        if (words.length >= 2) {
	            // Retrieve the second-to-last word
	            String secondToLastWord = words[words.length - 2];
	            System.out.println("Second-to-last word: " + secondToLastWord);
	        } else {
	            System.out.println("Input string does not contain enough words.");
	        }
	    }
	}
