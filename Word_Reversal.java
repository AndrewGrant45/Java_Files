package coding_practice;
public class Word_Reversal {
	public static void main(String[] args) {
		String line = "Dog bites man";
		String reversed = ""; 
	
	
	
		for ( int i = (line.length()-1); i >= 0; i--) {
			reversed += line.charAt(i);
			}
	
		System.out.println("Reversed statment: "+ reversed);
	}
}
