package sorting_algorithms;
public class BubbleSort {
	public static void bubbleSort(int[] arr) { //takes in an integer arr as a parameter
		int n = arr.length; //n is equal to the array length
		int tmp = 0; // used for swapping numbers in the array 
		//nested loop
		for (int x=0; x< n; x++) { //x is the first number of two to try and sort
			for(int y=1; y < (n-x); y++){ //y is the second number to try and sort 
				if(arr[y-1] > arr[y]){ // if the y-1 number in the list is greater then the y number, you swap them
				//swap elements
				tmp = arr[y-1];
				arr[y-1] = arr[y];
				arr[y] = tmp; //is the temporary storage of the variable
				}
			}
		}
	}
	// this part just allows you to print out the bubble sort. 	
	public static void main(String[] args) {
			int arr[] ={4,2,1,5,3};
			System.out.println("Array Before Bubble Sort");
			for(int x=0; x < arr.length; x++){
				System.out.print(arr[x] + " ");
			}
			System.out.println();
			bubbleSort(arr); // is calling the sorting algorithm 
			System.out.println("Array After Bubble Sort");
			for(int x=0; x < arr.length; x++){
				System.out.print(arr[x] + " ");
			}
	}
}