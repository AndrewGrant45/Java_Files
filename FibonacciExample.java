package basicJavaCodes;
public class FibonacciExample {
	public static void main (String[] args) {
		int count = 10;
		System.out.println("Fibonacci series: ");
		int firstNum = 0;
		int secondNum=1;
		System.out.print(firstNum + " " + secondNum + " ");
		
		for (int i = 2; i < count; i++) {
			int nextNum = firstNum + secondNum;
			System.out.print(nextNum + " ");
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}
}
