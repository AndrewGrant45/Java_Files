package basicJavaCodes;
public class PatternPrintingLoops {
	public static void main(String[] args) {
		int rows = 5;
		for(int i = 1; i <= rows; i++) {
			for (int j=i; j <= i; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
