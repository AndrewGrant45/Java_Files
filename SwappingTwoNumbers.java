package basicJavaCodes;
public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		System.out.println("Before swapping: num1 = " + num1 +" num2 = " + num2);
		
		//Swapping 
		int temp = num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping num1 = " + num1 + ", num2 = " + num2);
	}
}
