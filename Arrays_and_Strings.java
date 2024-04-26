package intermediate_Level;
public class Arrays_and_Strings {
	public static void main (String[]args) {
		int numbers[] = {1,2,3,4,5,6};
		
		System.out.print("Reversed array: ");
		int i = numbers.length-1;
		for (;i >=0; i--) {
			System.out.print(numbers[i] + " ");
		}		
	}
}