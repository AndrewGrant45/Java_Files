package basicJavaCodes;
public class StringManipulation {
	public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println("Length of the string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7, 12));
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Index of 'o': " + str.indexOf('o'));
    }
}
